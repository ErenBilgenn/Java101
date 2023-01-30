package Methods;

import java.util.Scanner;

public class PatternRecursive {
    static void pattern(int a, int count, boolean isContinue) {
        if (a <= 0)
            isContinue = false;
        if (a > 0 && isContinue == true) {
            System.out.print(a + " ");
            pattern(a - 5, ++count, isContinue);
        } else {
            System.out.print(a + " ");
            if (count == 0)
                return;
            pattern(a + 5, --count, isContinue);
        }
    }

    static void pattern(int a) {
        pattern(a, 0, true);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N değerini girin: ");
        int a = input.nextInt();

        pattern(a);

    }
}
