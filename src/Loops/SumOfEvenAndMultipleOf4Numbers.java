package Loops;

import java.util.Scanner;

public class SumOfEvenAndMultipleOf4Numbers {
    public static void main(String[] args) {
        int n, total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz : ");
            n = input.nextInt();
            if ((n % 2 == 0) && (n % 4 == 0)) {
                total += n;
            }
        } while (n % 2 == 0);
        System.out.println("Çift ve 4'ün katları olan sayıların toplamı : " + total);
    }
}
