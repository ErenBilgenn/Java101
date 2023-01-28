package Basic;

import java.util.Scanner;

public class TaxiFare {
    public static void main(String[] args) {
        int km;
        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        km = inp.nextInt();
        double para = (2.20*km)+10;
        boolean kosul1 = para<20;
        double sart = kosul1 ? 20 : (2.20*km)+10;

        System.out.println("Taksimetre ücreti : "+sart);


    }

}
