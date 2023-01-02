package ders21_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_Fibonacci {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan pozitif bir tamsayi alip,
        // o tamsayidan kucuk Fibonacci sayilarini bir liste olarak
        // kaydedin ve yazdirin
        //0 1 1 2 3 5 8 13 21 34 55 89 134...fibonacci sayıları bir önceki sayı ile toplanıyor hep

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz");
        int girilenSayi = scan.nextInt();

        if (girilenSayi < 0) {

            System.out.println("Fibonacci serisi için 0 dan buyuk tamsayı girmelisin");
        } else if (girilenSayi == 0) {
            System.out.println("0'dan kucuk fibonacci sayısı yoktur");
        } else if (girilenSayi == 1) {
            System.out.println("1'dan kucuk tek fibonacci sayısı vardır: 0");
        } else {
            fibonacciSayilariniyazdir(girilenSayi);

        }

    }

    public static void fibonacciSayilariniyazdir(int girilenSayi) {
        //buraya geldyse girilen sayi 1den buyuktur

        List<Integer> fibonacciListesi = new ArrayList<>();
        fibonacciListesi.add(0);
        fibonacciListesi.add(1);
        fibonacciListesi.add(1);

        int yeniFibonacciSayisi = 0;
        int index = 3; // ilk  3 eleman 0 1 1 olduğu için 3.index e geldik

        while (yeniFibonacciSayisi < girilenSayi) ;
        yeniFibonacciSayisi = fibonacciListesi.get(index - 2) + fibonacciListesi.get(index - 1);

        if (yeniFibonacciSayisi < girilenSayi) {
            fibonacciListesi.add(yeniFibonacciSayisi);

        }
        index++;
        System.out.println(fibonacciListesi);
    }

    }



