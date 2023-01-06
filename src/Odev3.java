import java.util.Scanner;
public class Odev3 {
    public static void main(String[] args) {
        double a, b, c, alan;

        Scanner inp = new Scanner(System.in);
        System.out.print("a kenarı : ");
        a = inp.nextDouble();
        System.out.print("b kenarı : ");
        b = inp.nextDouble();
        System.out.print("c Kenarı : ");
        c = inp.nextDouble();

        double cevre = a+b+c;
        System.out.println("Çevre Uzunluğu : "+cevre);

        double u = ((a+b+c)/2);
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgenin alanı : "+u);



    }
}
