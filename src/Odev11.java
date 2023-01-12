import java.util.Scanner;

public class Odev11 {
    public static void main(String[] args) {
        int heat;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        heat = inp.nextInt();

        if (heat<5){
            System.out.print("Kayağa gidebilirsiniz.");
        } else if (heat>=5 && heat<15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (heat>=15 && heat<25) {
            System.out.print("Pikniğe gidebilirsinz.");
        }else {
            System.out.print("Yüzmeye gidebilirsiniz.");
        }
    }
    }

