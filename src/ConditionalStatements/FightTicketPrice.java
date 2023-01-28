package ConditionalStatements;

import java.util.Scanner;

public class FightTicketPrice {
    public static void main(String[] args) {
        int mesafe, yas, tip;
        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        mesafe = inp.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = inp.nextInt();

        System.out.print("Yolculuk Tipini Giriniz (1 => Tek Yön , 2 => Gidiş-Dönüş) : ");
        tip = inp.nextInt();

        double toplam = mesafe * 0.10;
        double indirim = 0;
        double sontoplam = toplam - indirim;
        double indirim2 = sontoplam * 0.2;
        double sontoplam2 = (sontoplam - indirim2) * 2;

        if (mesafe >= 0 && yas >= 0) {
            if (tip == 1 || tip == 2) {
                switch (tip) {
                    case 1:
                        if (yas < 12) {
                            indirim = toplam * 0.5;
                            System.out.print("Toplam tutar : " + sontoplam);
                        } else if (yas > 12 && yas < 24) {
                            indirim = toplam * 0.1;
                            System.out.print("Toplam tutar : " + sontoplam);
                        } else if (yas > 65) {
                            indirim = toplam * 0.3;
                            System.out.print("Toplam tutar : " + sontoplam);
                        } else {
                            System.out.print("Toplam tutar : " + toplam);
                        }
                        break;
                    case 2:
                        if (yas < 12) {
                            indirim = toplam * 0.5;
                            sontoplam = toplam - indirim;
                            indirim2 = sontoplam * 0.2;
                            sontoplam2 = (sontoplam - indirim2) * 2;
                            System.out.print("Toplam tutar : " + sontoplam2);
                        } else if (yas > 12 && yas < 24) {
                            indirim = toplam * 0.1;
                            sontoplam = toplam - indirim;
                            indirim2 = sontoplam * 0.2;
                            sontoplam2 = (sontoplam - indirim2) * 2;
                            System.out.print("Toplam tutar : " + sontoplam2);
                        } else if (yas > 65) {
                            indirim = toplam * 0.3;
                            sontoplam = toplam - indirim;
                            indirim2 = sontoplam * 0.2;
                            sontoplam2 = (sontoplam - indirim2) * 2;
                            System.out.print("Toplam tutar : " + sontoplam2);
                        } else {
                            double tekindirim = toplam *0.2;
                            double tekindirimtoplam = (toplam - tekindirim) * 2;
                            System.out.print("Toplam tutar : " + tekindirimtoplam);
                        }
                        break;
                }
            } else {
                System.out.print("Hatalı giriş yaptınız!");
            }
        } else {
            System.out.print("Hatalı giriş yaptınız!");
        }
    }
}
