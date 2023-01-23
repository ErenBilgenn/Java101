import java.util.Scanner;

public class Odev26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        int n2 = input.nextInt();
        int i = 0,ebob = 1,k = 1, ekok = 1;

        while (i <= n1) {
            i++;
            if (n1 % i == 0 && n2 % i == 0){
                ebob = i;
            }
        }while (k <= (n1*n2)){
            k++;
            if (k % n1 == 0 && k % n2 == 0){
                ekok = k;
                break;
            }
        }
        System.out.println("EBOB : "+ebob);
        System.out.println("EKOK : "+ekok);
    }
}
