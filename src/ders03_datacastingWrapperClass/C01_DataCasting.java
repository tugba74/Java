package ders03_datacastingWrapperClass;

public class C01_DataCasting {
    public static void main(String[] args) {
        /*
        bazi data türleri asla birbirine cast edilemez
         */
        //String str=20;
        //boolean mutluMu="true";
        //int a=true;

        double s=20;
        int sayi=15;
        long ln =sayi; //esitliğin sol tarafi long,sağ tarafı yani deger int
                       //java itiraz etmedi

        short sh=23;

        int a=sh;

        long lng=sh;

        float fl=lng;

        /*
        ama tersini yapmak isterseniz
        yani büyük data
         */
        double dbl=20;
        // a = dbl;

        // short abc= dbl;



    }
}
