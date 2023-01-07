import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
        int r;
        double 𝛼,pi =3.14;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz : ");
        r = inp.nextInt();
        System.out.print("Dairenin merkez açısını giriniz : ");
        𝛼 = inp.nextDouble();

        double alan = (pi*(r*r)*𝛼)/360;

        System.out.print("Daire diliminin Alanı : "+alan);



    }
}
