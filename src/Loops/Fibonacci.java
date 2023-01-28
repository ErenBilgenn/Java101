package Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("x elemanlı fibonacci serisi; x = ");
        int x = inp.nextInt();
        int next, step1 = 0, step2 = 1;

        for (int i = 0; i < x; i++) {
            if (i <= 1) {
                next = i;
            } else {
                next = step1 + step2;
                step1 = step2;
                step2 = next;
            }
            System.out.print(next + " ");
        }
    }
}
