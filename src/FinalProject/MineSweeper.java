package FinalProject;

import java.util.Scanner;

public class MineSweeper {
    int row;
    int column;
    String[][] mine;
    String[][] game;
    int mines;


    public MineSweeper(int row, int column) { //constructor.
        this.row = row;
        this.column = column;
        this.mine = new String[row][column];
        this.game = new String[row][column];
        this.mines = (row * column) / 4;
    }


    void game() {
        for (int i = 0; i < this.game.length; i++) {
            for (int j = 0; j < this.game[i].length; j++) {
                this.game[i][j] = " - ";
            }
        }
    }


    void print() {
        for (int i = 0; i < this.game.length; i++) {
            for (int j = 0; j < this.game.length; j++) {
                System.out.print(this.game[i][j]);
            }
            System.out.println();
        }
    }


    void mines() {

        while (this.mines > 0) {

            int rndRow = (int) (Math.random() * this.row);
            int rndColumn = (int) (Math.random() * this.column);

            if (this.mine[rndRow][rndColumn] != " * ") {
                this.mine[rndRow][rndColumn] = " * ";
                this.mines--;
            }
            continue;
        }


        for (int i = 0; i < this.mine.length; i++) {
            for (int j = 0; j < this.mine[i].length; j++) {
                if (this.mine[i][j] != " * ") {
                    this.mine[i][j] = " - ";
                }
                System.out.print(this.mine[i][j]);
            }
            System.out.println();
        }

    }


    void printMineMap() {

        for (int i = 0; i < this.mine.length; i++) {
            for (int j = 0; j < this.mine.length; j++) {
                System.out.print(this.mine[i][j]);
            }
            System.out.println();
        }

    }


    void run() {

        Scanner scan = new Scanner(System.in);

        int totalMove = (row * column) - mines;


        game();
        System.out.println("Location of mines");
        mines();
        System.out.println("Welcome to the MineSweeper!");

        while (totalMove > 0) {
            int counter = 0;


            System.out.println("-------------------");
            System.out.println("Remaining moves: " + totalMove);
            print();

            System.out.print("Enter the row number: ");
            int rowNumber = scan.nextInt();
            System.out.print("Enter the column number: ");
            int columnNumber = scan.nextInt();


            if (rowNumber < 0 || rowNumber >= this.row || columnNumber < 0 || columnNumber >= this.column) {
                System.out.println("Wrong index.Please try again!");
                continue;
            } else {
                if (this.mine[rowNumber][columnNumber] == " * ") {
                    System.out.println("Game Over.");
                    printMineMap();
                    break;
                }
                if (this.game[rowNumber][columnNumber] != " - ") {
                    System.out.println("You already did this move!");
                    continue;
                } else {

                    int minRow = (rowNumber - 1), maxRow = (rowNumber + 1);
                    int minColumn = (columnNumber - 1), maxColumn = (columnNumber + 1);

                    if (minRow < 0 || minColumn < 0) {
                        minRow = 0;
                        minColumn = 0;
                    }

                    if (maxRow >= row || maxColumn >= column) {
                        maxRow = rowNumber;
                        maxColumn = columnNumber;
                    }

                    for (int i = minRow; i <= maxRow; i++) {
                        for (int j = minColumn; j <= maxColumn; j++) {
                            if (this.mine[i][j] == " * ") {
                                counter++;
                            }
                        }
                    }


                    String mineCounter = String.valueOf(counter);
                    this.game[rowNumber][columnNumber] = " " + mineCounter + " ";
                    totalMove--;

                }

            }
        }

        if (totalMove == 0) {
            System.out.println("You win!");
            printMineMap();
        }

    }

}
