package Loops;

import java.util.Scanner;

public class BiggestSmallestNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        int n = inp.nextInt();
        int n1, large = 0, small = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz : ");
            n1 = inp.nextInt();
            if (n1 > large) {
                large = n1;
            }
            if (i == 1 && n1 > 0) {
                small = n1;
            }
            if (n1 < small) {
                small = n1;
            }
        }
        System.out.println("En büyük sayı : " + large);
        System.out.println("En küçük sayı : " + small);
    }
}

