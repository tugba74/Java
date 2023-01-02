package ders09_StringManupulation;

public class C07_subString {
    public static void main(String[] args) {
        String str= "Java gun gectikce guzellesiyor";

        System.out.println(str.substring(5,8)); // gun
        // 5.indexten başlar 8-5 karakter yazdırır.
        //5.index dahil (inclusive), 8.index haric (exclusive)

        //gectikce yazdırın

        System.out.println(str.substring(9,17)); //gectikce

        System.out.println(str.substring(3,7)); //a gu

        String isim="huseYIN";
        //verilen ismi ilk harfi büyük, geriye kalanlar kü.ük arf olarak kaydedin

        isim=isim.substring(0,1).toUpperCase( )+ //ilk hRFİ ALIP BÜYÜK HARF YAPTIK
             isim.substring(1).toLowerCase(); //1.indexte ve sonrakinı alıp kucuk harf yaptık

        System.out.println(isim); //huseyin

        System.out.println(isim.substring(2,5)); //sey

        //sadece 3.harfi yazdırın
        System.out.println(isim.substring(3,4)); //e
        System.out.println("zor sorunun cevabı: " +isim.substring(2,2)); // 2-2=0 hiç bir şey yazdırmaz hiçlik yazdırır.
        //çünkü 2den başla iki dahil olmasın deniyor .

        //System.out.println(isim.substring(5,2)); // stringındexoutofboundsexception

    }
}
