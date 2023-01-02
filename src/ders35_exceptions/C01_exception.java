package ders35_exceptions;

import java.util.Scanner;

public class C01_exception {

    public static void main(String[] args) {
        //Kullanicidan bir tamsayi alin
        //ve sayinin karesini yazdirin
        // kullanıcı ondalıklı sayı girerse kullanıcıya
        // uyarı yazısı yazdırıp tekrar sayı isteyen bir method olsturun




        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");

        int girilensayi= scan.nextInt();
        System.out.println(girilensayi*girilensayi);

    }
}
