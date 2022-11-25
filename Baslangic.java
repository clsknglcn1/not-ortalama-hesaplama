package Giris;
import java.util.Scanner;

import static java.lang.System.in;

public class Baslangic {
    public static void main(String[] args) {
        // degişkenleri olustur 1. adım
                int mat, fizik, kimya, turkce, tarih, muzik;

                // Scanner sınıfımız tanımladık 2.adım
        Scanner a =new Scanner(in);

        // kulanıcıdan değer alınmalı 3.adım
        System.out.print("Fizik notunuzu giriniz:" );
        fizik=a.nextInt();

        System.out.print("Kimya notunuzu giriniz:" );
        kimya=a.nextInt();

        System.out.print(" Türkçe notunuzu giriniz:" );
        turkce=a.nextInt();

        System.out.print("Matematik notunuzu giriniz:" );
        mat=a.nextInt();

        System.out.print("Tarih notunuzu giriniz:" );
        tarih=a.nextInt();

        System.out.print("Müzik notunuzu giriniz:" );
        muzik=a.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ort = toplam/6.0;
        System.out.println(ort);
       String sonuc = (ort>60  ?  "Sınıfı Geçti " : " Sınıfta kaldı");
       System.out.println(sonuc);










    }

}
