package ders11_stringManupulation;

public class C07_soru {
    public static void main(String[] args) {
        //kullanıcıdan isim ve soyismini ayrı ayrı alın
        //ismi daha uzun ise isim ve soyismi ilk hafri büyük kalanlar küçük şeklinde yazdırın
        //soyisim daha uzun ismi ilk harf buyuk dieğrleri kucuk, soyismi buyuk harflerle yazdırın.

        String isim="Mehmet";
        String soyisim="Harungil";
        String yeniIsimSoyisim;

        if (isim.length()>soyisim.length()){
            //isim ve soyismi ilk hafri büyük kalanlar küçük şeklinde yazdırın

                   yeniIsimSoyisim=isim.substring(0,1).toUpperCase()+
                                   isim.substring(1).toLowerCase()+
                                   " "+
                                   soyisim.substring(0,1).toUpperCase()+
                                    soyisim.substring(1).toLowerCase();

        }else {
            //ismi ilk harf buyuk dieğrleri kucuk, soyismi buyuk harflerle yazdırın.
                    yeniIsimSoyisim = isim.substring(0, 1).toUpperCase() +
                    isim.substring(1).toLowerCase() +
                    " " +
                    soyisim.toUpperCase();
        }
        System.out.println(yeniIsimSoyisim);

        }
    }

