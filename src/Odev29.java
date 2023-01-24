import java.util.Scanner;

public class Odev29 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayısı : ");
        int n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (n * 2 - (2 * i - 1)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
