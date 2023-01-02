package ders02_dataTurleri_Scanner;

import java.util.Scanner;

public class C00_Deneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("birinci çocuğun yaşını giriniz");
        int yas1 = scan.nextInt();
        System.out.println("ikinci çocuğun yaşını giriniz");
        int yas2 = scan.nextInt();
        System.out.println("üçüncü çocuğun yaşını giriniz");
        int yas3 = scan.nextInt();


        System.out.println("yaşların toplamı:" + (yas1+yas2+yas3));
        System.out.println("yaşların farkı :" + (yas1-yas2-yas3));
        System.out.println("yaşların çarpımı:" + (yas1*yas2*yas3));

    }
}
