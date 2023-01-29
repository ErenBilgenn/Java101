package Methods;

import java.util.Scanner;

public class PrimeNumberWithRecursive {
    static boolean isPrime(int a,int b){
        if (a <= 2){
            return (a == 2);
        }
        if (a % b == 0){
            return false;
        }
        if (b*b >  a){
            return true;
        }
        return isPrime(a,b+1);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int a = inp.nextInt();
        boolean result = isPrime(a,2);
        if (result){
            System.out.println(a+" sayısı ASALDIR!");
        }else {
            System.out.println(a+" sayısı ASAL DEĞİLDİR!");
        }
    }
}
