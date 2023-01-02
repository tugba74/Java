package ders25_staticKeyword;

public class C04_PassByValue {
    public static void main(String[] args) {

        double fiyat=100;

        System.out.println(indirimUygula(fiyat)); //90


    }
    public static double indirimUygula(double fiyat){

        //%10 indiirm yapsin

        fiyat= fiyat*9/10; //fiyata atama yaptık kalıcı olarak 90 oldu
        return fiyat;
    }
}
