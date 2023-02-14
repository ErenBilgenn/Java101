package Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
        };
        int[][] transpose = new int[matris[0].length][matris.length];
        System.out.println("Matris : ");

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose : ");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                transpose[i][j] = matris[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }
}
