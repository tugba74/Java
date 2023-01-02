package ders02_dataTurleri_Scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        // Soru 4-Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen dikdörtgenin iki kenar uzunluğunu girin" +
                "\niki kenar uzunluğu arasında entera basın");
        double kenar1= scan.nextDouble();
        double kenar2=scan.nextDouble();

        System.out.println("dikdörgenin alanı : " + (kenar1*kenar2));

    }
}
