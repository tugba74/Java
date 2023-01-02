package ders03_datacastingWrapperClass;

public class C05_WrapperClass {
    public static void main(String[] args) {
        int sayi=10;
        String str="java çok güzeldir";
        /*
        primitive data türleri sadece deger barindirirlar, hazır methodlari yoktur
        javaya yapılan talepler sonucunda java
        primitive data turleri ile bazı hazir methodların kullanılabilmesi için
        wrapper classlar oluşturulmuştur.

        Wrpper classlar primitive data türlerindeki degerleri alırlar
        ancak methodları da vardır
         */

        char krk='b';
        Character krkWrapper='c';
        System.out.println(Character.isLetter('5')); //false
        System.out.println(Character.isDigit('7')); //true

        String str1= "123";
        String str2= "12";

        //str1 ve str2 nin değerlerini matematiksel olarak toplayın
        System.out.println("str1+str2"); //12312
        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2)); //135

        // ınteger.parseInteger(str) içine yazılan str rakamlardan olusuyorsa str'i int'a ceviri
        //ancak bir karakter bile rakam degilse hata verir

        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Short.MIN_VALUE); //-32768



    }

}
