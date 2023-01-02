package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {

        /*
        kullanıcıdan toplanmak üzere tam sayılar  alın.
         kullanıcı sıfıra basarsa sayı alma işlemini bitirin
         kullanıcının kaç sayı girdiğini
         ve bu sayıların toplamının kaç olduğunu yazdırın

         */
        Scanner  scan =new Scanner (System.in);
        int girilensayi=1; //verilen ilk deger bu soru icin 0 olmamalı.
                           // cunku 0 loopu  bıtırmek icin kullanılır.

        int sayac=0;
        int toplam=0;

        while (girilensayi !=0){
            System.out.println("Lutfen toplamak icin tamsayi girin" +
                    "\nBitirmek icin 0'a basin");
            girilensayi=scan.nextInt();

            if (girilensayi!=0){
                sayac++;
                        toplam=toplam+girilensayi;
            }

        }
        System.out.println("girilen"+sayac+"adet sayinin toplamı :"+ toplam);
    }
}
