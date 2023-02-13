package Arrays;

import java.util.Arrays;

public class FrequencyNumbers {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20, 5};
        System.out.println("Dizi : " + Arrays.toString(list));
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        System.out.println("Tekrar sayıları : ");
        for (int i = 0; i < list.length; i++) {
            int count = 1;
            if (!isFind(duplicate, list[i])) {
                for (int j = i + 1; j < list.length; j++) {
                    if (list[i] == list[j]) {
                        duplicate[startIndex++] = list[i];
                        count++;
                    }

                }
                duplicate[startIndex++] = list[i];
                System.out.println(list[i] + " Sayısı " + count + " kere tekrar edildi.");
            }

        }

    }
}

