package Basic;

import java.util.Scanner;

public class CircleZoneArea {
    public static void main(String[] args) {
        int r;
        double 𝛼,pi =3.14;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz : ");
        r = inp.nextInt();

        double cevre = 2*pi*r;
        double alan = pi*r*r;

        System.out.println("Daireinin Çevresi : "+cevre);
        System.out.println("Dairenin Alanı : "+alan);

        System.out.print("Dairenin merkez açısını giriniz : ");
        𝛼 = inp.nextDouble();

        double dilimalan = (pi*(r*r)*𝛼)/360;

        System.out.print("Daire diliminin Alanı : "+dilimalan);



    }
}
