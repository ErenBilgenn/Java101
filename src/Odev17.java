import java.util.Scanner;

public class Odev17 {
    public static void main(String[] args) {
        int k,toplam = 0,bolen = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        k = inp.nextInt();

        for (int i = 1; i <= k; i++){
            if ((i % 3 == 0) && (i % 4 == 0)){
                toplam+=i;
                bolen++;
            }
        }System.out.println("3 ve 4'e tam bölünen sayıların ortalaması : "+(toplam/bolen));
    }
}
