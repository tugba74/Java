package ders04_matematikselislemler_incrementDecrement;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {
        // kullanıcıdan iki integer değer alıp
        // bunları birbirine bölün ve sonucu double olarak yazdırın.

    Scanner scan=new Scanner(System.in);
        System.out.println("lütfen iki tamsayı giriniz");

        int sayi1= scan.nextInt(); //20
        int sayi2=scan.nextInt(); //6
        System.out.println(sayi1/sayi2); //3

        double ondalikliSonuc=(double)(sayi1/sayi2);
        System.out.println(ondalikliSonuc); //3,0

        double dogruSonuc = (double)sayi1 / sayi2;  //double/int  geniş olana göre sonuç verir

        System.out.println(dogruSonuc); //3.33333333

    }
}
