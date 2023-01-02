package ders04_matematikselislemler_incrementDecrement;

import java.util.Scanner;

public class C02_DataCasting {
    public static void main(String[] args) {

        //soru 4

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz");

        double sayi1=scan.nextDouble();
        double sayi2= scan.nextDouble();
        int bolmeSonucuTamsayi= (int)(sayi1/sayi2);

        System.out.println(bolmeSonucuTamsayi);

    }
}
