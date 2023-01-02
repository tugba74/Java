package ders16_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {

        // 10,11,12 sayılarını toplayan bir while loop olusturalım

        int sayi = 10;
        int toplam = 0;
        while (sayi <= 12) {

            toplam += sayi;

            sayi++;
        }
        /*
        while loop da 2 problem oluşabilir.
        1-önce degeri kontrol edip,sonra islem yaptıgımızdan
        body de bir kere daha kontrol etmemiz gerekebilir
        2- yapilan islem sayısından 1 fazla while bitis sarti kontrol edilir
        3- while loopta öncesinde degerleri

         */

    }
}
