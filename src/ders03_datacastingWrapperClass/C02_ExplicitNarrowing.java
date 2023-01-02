package ders03_datacastingWrapperClass;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {
        int sayi=20;

        /*
        geniş data turundeki bir degeri
        dar data turundeki bir variable'a atamak isterseniz
        java sorumluluğualmanızı ister
        bu sorumluluğu almak için cast edeceğimiz degerin onune () içerisinde
        cast etmek istediğimiz data türü yazilir.

        ancak bu durumda data kayiplari (double den int e gecerken virgulden sonrası silinir)
        veya baskalasim olabiir. (int i byte cevirirsek tekrar tekrar basa doner)
         */

        short sh= (short)sayi;
        System.out.println(sh); //20
        double dbl =23.5;
        int say= (int)dbl;
        System.out.println(say); // 23
        say= 256; // int
        byte byt= (byte)say;
        System.out.println(byt); // 0
    }
}


