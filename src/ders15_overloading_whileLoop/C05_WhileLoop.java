package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {

        /*
        kullanıcıdan toplanmak uzere sayi alın sayıların toplamı 500'e esit olur veya gecerse

        girilen sayı adedi
        girilen sayıların toplamını ve
        "Bu kadar yeter" yazdırın
         */

        Scanner scan= new Scanner (System.in);
        double girilensayi=0;
        double toplam=0;
        int sayac=0;

        while (toplam<500) {
            System.out.println("toplanmak icin sayı giriniz");
            girilensayi = scan.nextDouble();
            toplam =toplam+ girilensayi;
            sayac++;
        }
        System.out.println("Girilen " + sayac+ "sayinin toplami :" +toplam + "oldu. Bu kadar yeter");


    }
}
