import java.util.Scanner;

public class Odev25 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int select;
        int balance = 3000;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = inp.nextLine();
            System.out.print("Parolanız : ");
            password = inp.nextLine();
            if (userName.equals("patika") && password.equals("dev3344")) {
                System.out.println("Merhaba, X Bankasına Hoşgeldiniz.");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para Miktarı : ");
                            int price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para Miktarı : ");
                            price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz !");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.Lütfen kartınızı unutmayınız !");
                break;
            } else {
                right--;
                if (right == 0) {
                    System.out.println("Kartınız bloke edilmiştir! Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Hatalı Kullanıcı Adı veya Parola girdiniz tekrar deneyiniz ! ");
                    System.out.println("Kalan giriş hakkınız : " + right);
                }
            }
        }
    }
}
