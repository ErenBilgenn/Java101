package ConditionalStatements;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int yil;
        Scanner inp = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        yil =inp.nextInt();

        String artik = "";

        if ((yil%100)==0){
            if ((yil%400)==0){
                artik = " bir artık yıldır !";
            }else {
                artik = " bir artık yıl değildir !";
            }
        } else if ((yil%4)==0) {
            artik = " bir artık yıldır !";
        }else {
            artik = " bir artık yıl değildir !";
        }
        System.out.print(yil+artik);
    }
}
