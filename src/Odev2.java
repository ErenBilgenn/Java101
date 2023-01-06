import java.util.Scanner;
public class Odev2 {
    public static void main(String[] args) {
        double fiyat ;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ürünün fiyatını giriniz : ");
        fiyat = inp.nextDouble();

        boolean kosul1 = fiyat<1000;
        double sart = kosul1 ? 0.18 : 0.08;
        double kdvfiyati = fiyat*sart;
        System.out.println("Ürünün KDV Oranı : "+sart);
        System.out.println("Ürünün KDV tutarı : "+kdvfiyati);
        double hesap = fiyat+kdvfiyati;
        System.out.println("Ürünün KDV dahil fiyatı : "+hesap);







    }
}
