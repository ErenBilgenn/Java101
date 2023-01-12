import java.util.Scanner;

public class Odev9 {
    public static void main(String[] args) {
        String userName, password, newpassword;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java")) {
            System.out.println("Giriş Yaptınız.");
        }else {
            System.out.println("Hatalı Kullanıcı Adı veya Şifre Girdiniz!");
            System.out.print("Şifrenizi Sıfırlamak İster Misiniz ?\n1-EVET\n2-HAYIR\nTercihiniz : ");

            String tercih = inp.nextLine();

            if (tercih.equals("EVET")){
                System.out.print("Yeni Şifrenizi Giriniz : ");
                newpassword = inp.nextLine();
                if (newpassword.equals("java")){
                    System.out.print("Yeni Şifreniz Eski Şifreniz İle Aynı Olamaz!");
                }else {
                    System.out.print("Şifre Oluşturuldu.");
                    System.out.print("Yeni Şifreniz : "+newpassword);
                }
            } else if (tercih.equals("HAYIR")) {
                System.out.print("Kullanıcı Adınız : ");
                userName = inp.nextLine();

                System.out.print("Şifreniz : ");
                password = inp.nextLine();
                if (userName.equals("patika") && password.equals("java")){
                    System.out.println("Giriş Yaptınız.");
                }


            }


        }

    }
}
