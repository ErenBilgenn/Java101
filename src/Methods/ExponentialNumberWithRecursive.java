package Methods;

import java.util.Scanner;

public class ExponentialNumberWithRecursive {
    static int power(int a,int b){
        if (b == 0 ){
            return 1;
        } else {
            return a * power(a,b-1);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int a = inp.nextInt();
        System.out.print("Üs değerinin giriniz : ");
        int b = inp.nextInt();
        int result = power(a,b);

        System.out.println("Sonuç : "+result);


    }
}
