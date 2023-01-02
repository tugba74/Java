package ders02_dataTurleri_Scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        // soru 2- kullanıcıdan bir double, bir de tamsayı
        // bunlarin toplamini ve carpimini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen ondalıklı bir sayı giriniz");
        double ondalikliSayi= scan.nextDouble();
        System.out.println("lütfen bir tamsayi giriniz");
        int tamSayi = scan.nextInt();

        System.out.println("girilen sayilarin toplamı : " + (ondalikliSayi+tamSayi));
        System.out.println("girilen sayilarin çarpimi : " + (ondalikliSayi*tamSayi));


    }
}
