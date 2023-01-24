import java.lang.annotation.ElementType;
import java.util.Scanner;

public class Odev28 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n = inp.nextInt();
        int i = 1;
        int sum = 0;

        while (i < n) {
            if (n % i == 0) {
                sum += i;
            }
            i++;
        }
        if (sum == n) {
            System.out.println(n + " Mükemmel sayıdır.");
        } else {
            System.out.println(n + " Mükemmel sayı değildir");
        }
    }
}

