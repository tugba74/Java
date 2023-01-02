package ders02_dataTurleri_Scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        //      Isminiz : John
        //      Soyisminiz : Doe
        //      Yasiniz : 44
        //      Kaydiniz basariyla tamamlanmistir.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim= scan.next();
        System.out.println("lütfen soyisminizi giriniz");
        String soyisim= scan.next();
        System.out.println("lütfen yasinizi giriniz");
        double yas=scan.nextDouble();
        System.out.println("isim :" + isim + "\nsoyisim :"+soyisim+
                "\nyasiniz : "+yas+ "\nkaydınız basariyla tamamlanmıştır");
        //System.out.println("soyisim :" + soyisim);
        //System.out.println("yas:" + yas);
        //System.out.println("kaydınız başarı ile tamamlanmıştır");

        //System.out.println("Isminiz : " + isim +"\nsoyisminiz : "+ soyisim+
            //    "\nyasiniz : "+ yas + "\nKaydiniz basariyla tamamlanmistir.");


    }
}
