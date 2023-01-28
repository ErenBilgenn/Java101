package Loops;

import java.util.Scanner;

public class TriangleWithStars {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");
        int n = inp.nextInt();

        for (int i = 1; i <= (n / 2) + 1; i++) {

            for (int k = 1; k <= ((n / 2 + 1) - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n / 2; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * ((n / 2 + 1) - i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
