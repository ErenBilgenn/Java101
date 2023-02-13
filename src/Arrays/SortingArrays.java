package Arrays;

import java.util.Scanner;
import java.util.Arrays;


public class SortingArrays {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = inp.nextInt();
        int[] list = new int[n];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0;i < n;i++){
            System.out.print((i+1)+ ". Elemanı : ");
            list[i] = inp.nextInt();
        }
        Arrays.sort(list);
        System.out.print("Sıralama : "+Arrays.toString(list));
    }
}
