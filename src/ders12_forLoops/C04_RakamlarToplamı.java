package ders12_forLoops;

public class C04_RakamlarToplamı {
    public static void main(String[] args) {

        //kullanıcının verdiği sayinin rakamaetoplamını bulun
        long sayi= 430112388411L;
        String sayiStr=""+sayi;

        long birlerBasamagi=0;
        long rakamlarToplami=0;

        for (int i=1; i<=sayiStr.length() ; i++) {

            birlerBasamagi=sayi%10;
            rakamlarToplami= rakamlarToplami+birlerBasamagi;
            sayi=sayi/10;

        }
        System.out.println(rakamlarToplami);

    }
}
