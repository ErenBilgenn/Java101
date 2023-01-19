import java.util.Scanner;

public class Odev21 {
    public static void main(String[] args) {
        int a,b,total = 1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı : ");
        a = scan.nextInt();

        System.out.print("Üs olacak sayı : ");
        b = scan.nextInt();

        for (int i = 1; i<=b; i++){
            total *= a;
        }
        System.out.println("Cevap : "+total);
    }
}
