package Loops;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int n, total1 = 1,total2 =1,total3 = 1,r;
        Scanner scan = new Scanner(System.in);

        System.out.print("C(n,r) olmak üzere n sayısını giriniz : ");
        n = scan.nextInt();

        System.out.print("C(n,r) olmak üzere r sayısını giriniz : ");
        r = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            total1 *= i;
        }
        for (int i = 1; i <= r; i++) {
            total2 *= i;
        }
        for (int i = 1; i <= n - r; i++) {
            total3 *= i;
        }
        int result = total1 / (total2 * total3);

        System.out.println("C(n,r) : " + result);
    }
}
