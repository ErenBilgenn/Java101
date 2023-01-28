package ConditionalStatements;

import java.util.Scanner;

public class CoursePass {
    public static void main(String[] args) {
        int mat, fizik,turkce,kimya,muzik;
        double giris = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();
        if (mat>0 && mat<100){
            giris+=mat;
        }
        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();
        if (fizik>0 && fizik<100){
            giris+=fizik;
        }
        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();
        if (turkce>0 && turkce<100){
            giris+=turkce;
        }
        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();
        if (kimya>0 && kimya<100){
            giris+=kimya;
        }
        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();
        if (muzik>0 && muzik<100){
            giris+=muzik;
        }
        double ort =giris/5;

        if (ort>=55){
            System.out.println("Sınıfı Geçtiniz.");
        }else{
            System.out.println("Sınıfta Kaldınız!");
        }
        System.out.print("Ortalamanız : "+ort);


    }
}
