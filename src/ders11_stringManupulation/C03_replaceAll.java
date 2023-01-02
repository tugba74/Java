package ders11_stringManupulation;

public class C03_replaceAll {
    public static void main(String[] args) {

        String str="J1ava2 G9uzel5dir8";
        //str daki sayıları silip java güzeldir haline dönüştürelim
        //str.replaceAll () sadece bir harf veya char squence i değil
        //genelleme ile söyleyebileceğimiz ortak özellikteki tüm karakterleri değiştirir.


        System.out.println(str.replaceAll("\\d","")); // Java Güzeldir \\d sayıları alma

        System.out.println(str.replaceAll("\\D","")); //12958 \\sayı haricinde alma

        String s1="ilk urun fiyati : 1250 tl";
        String s2= "ikinci urun fiyati : 1500tl";
        //iki ürünün fiyatı toplayın
        s1=s1.replaceAll("\\D",""); //1250
        s2=s2.replaceAll("\\D",""); //1500

        System.out.println(s1+s2); //12501500
        System.out.println(Integer.parseInt (s1)+Integer.parseInt(s2)); //2750




    }
}
