package Methods;

import java.util.Scanner;

public class AdvancedCalculator {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplamı : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma : " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpımı : " + result);
        return result;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("İkinci sayı 0 olamaz!");
            return 1;
        }
        int result = a / b;
        System.out.println("Bölümü : " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Üs hesabı : " + result);
        return result;
    }

    static int com(int a, int b) {
        int total1 = 1, total2 = 1, total3 = 1;
        for (int i = 1; i <= a; i++) {
            total1 *= i;
        }
        for (int i = 1; i <= b; i++) {
            total2 *= i;
        }
        for (int i = 1; i <= a - b; i++) {
            total3 *= i;
        }
        int result = total1 / (total2 * total3);
        System.out.println("C(" + a+"," + b+") : " + result);
        return result;
    }

    static int mod(int a, int b) {
        int result;
        result = a % b;
        System.out.println("Mod işlemi : " + result);
        return result;
    }
    static void rectangle(int a,int b ){
        System.out.println("Çevresi : "+ 2*(a+b));
        System.out.println("Alanı : "+(a*b));
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktöriyel Hesabı\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap\n";
        System.out.print(menu);
        int select;

        while (true) {
            System.out.print("Bir işlem seçiniz : ");
            select = inp.nextInt();
            if (select == 0){
                break;
            }
            System.out.print("İlk sayı : ");
            int a = inp.nextInt();
            System.out.print("İkinci Sayı : ");
            int b = inp.nextInt();
            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    com(a, b);
                    break;
                case 7:
                    mod(a, b);
                    break;
                case 8:
                    rectangle(a,b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz!");
            }
        }
        System.out.println("Güle Güle");
    }
}
