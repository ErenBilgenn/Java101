package Practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner scan = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = scan.nextInt();

            if (selected < 0 || selected > 100) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız.Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girdiğinizde hakkınızdan düşecektir !");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler.Doğru tahmin ettiğiniz sayı : " + number);
                isWin = true;
                break;
            } else {
                wrong[right++] = selected;
                System.out.println("Hatalı bir sayı girdiniz!");
                if (selected < number) {
                    System.out.println(selected + " sayısı,gizli sayıdan küçüktür.");
                } else {
                    System.out.println(selected + " sayısı,gizli sayıdan büyüktür.");
                }
                System.out.println("Kalan tahmin hakkınız : " + (5 - right));
            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz!");
            System.out.println("Gizli Sayı : " + number);
            System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
        }
    }
}
