package ders08_ternary_switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int a=5;

        /*
        Ternary operatörü tek başına kullanılamaz
        ternary bize bir sonuç verir
        bu sonucu ya direkt yazdırmalı veya bir variablr a atamalıyız
         */
        String sonuc =a%2==0 ? "çift sayi" : "teksayi";

        //ternarynin sonucunu bir variable a atayacaksak
        //true ve false durumlarında üretilecek sonucun aynı
        // data türüne uygun olması gerekir.
        //aksi halde CTE oluşur.

        //ama ternary i sout içinde kullanılarsak sonuçların
        //data turunun aynı olması sart olmaz

        String sonuc2 = a>10 ? "buyuk sayi" : "2*a"; //  CTE vermemesi için stringe çevirdik.

        System.out.println(a>10 ? "buyuk sayi" : "(2*a)");
    }
}
