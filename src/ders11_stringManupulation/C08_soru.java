package ders11_stringManupulation;

public class C08_soru {
    public static void main(String[] args) {
        //Kullanıcıdan bir şifre isteyip aşağıdaki şartları kontrol edin ve
        //kullanıcıya duzeltmesi gereken tum eksikleri söyleyin
        //eğer tüm sartları sağlarsa  , "şifre basarıyla kaydedildi" yazdırın
        //-ilk harf kucuk olmalı
        //-son karakter rakam olmalı
        //-sifre boşluk içermemeli
        //-uzunluğu en az 10 karakter olmalı

        String sifre = "nasılsınKardes1";
        int bayrak=0;

        if (!(sifre.charAt(0) > 'a' && sifre.charAt(0) <= 'z')) {  //küçük a'dan küçük ya da küçük z den küçük olmalı eğer olmazsa yazdır.
            System.out.println("ilk harf kucuk harf olmalı");
            bayrak++;
        }
        //son karakter rakam olmalı. hatayı 0-9  arasında olmama durumunda yazdır
        if (!(sifre.charAt(sifre.length() - 1) >= '0') && sifre.charAt(sifre.length() - 1) <= '9') {
            System.out.println("son karakter rakam olmali");
            bayrak++;
        }

        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
            bayrak++;
        }
        if (!(sifre.length() >= 10)) {
            System.out.println("sifre en az 10 haneli olmalı");
            bayrak++;

        }
        if (bayrak==0);
        System.out.println("sifre basarıyla kaydedildi");
    }

}

