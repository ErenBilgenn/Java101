package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMaxValue {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        System.out.println(Arrays.toString(list));

        Scanner inp = new Scanner(System.in);
        System.out.print("Girilen Sayı : ");
        int n1 = inp.nextInt();
        int min = 0;
        int max = 0;
        boolean minSet = false;
        boolean maxSet = false;

        for (int i : list) {
            if (i < n1 && (!minSet || i > min)) {
                min = i;
                minSet = true;
            }
            if (i > n1 && (!maxSet || i < max)) {
                max = i;
                maxSet = true;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}
