import java.util.Scanner;

public class Odev22 {
    public static void main(String[] args) {
        int number;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        number = inp.nextInt();
        int basValue;
        int sum = 0;

        while(number != 0){
            basValue = number % 10;
            number /= 10;
            sum += basValue;
        }
        System.out.println("Basamak sayılarının toplamı : "+sum);
    }
}
