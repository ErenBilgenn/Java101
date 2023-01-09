import java.util.Scanner;

public class Odev7 {
    public static void main(String[] args) {
        int armut, elma, domates, muz, patlican;

        Scanner inp = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        armut = inp.nextInt();
        System.out.print("Elma kaç kilo ? : ");
        elma = inp.nextInt();
        System.out.print("Domates Kaç Kilo ? : ");
        domates = inp.nextInt();
        System.out.print("Muz Kaç Kilo ? : ");
        muz = inp.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlican = inp.nextInt();

        double armfiyat = 2.14*armut;
        double elmafiyat = 3.67*elma;
        double dmtfiyat = 1.11*domates;
        double muzfiyat = 0.95*muz;
        double ptlnfiyat = 5*patlican;
        double toplam = armfiyat+elmafiyat+dmtfiyat+muzfiyat+ptlnfiyat;

        System.out.print("Toplam Tutar : "+toplam);


    }
}
