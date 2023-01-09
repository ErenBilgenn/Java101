import java.util.Scanner;

public class Odev6 {
    public static void main(String[] args) {
        double boy;
        int kilo;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu Giriniz : ");
        boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = inp.nextInt();


        double sonuc = kilo/(boy*boy);
        System.out.print("Vücut Kitle İndeksiniz : "+sonuc);


    }
}
