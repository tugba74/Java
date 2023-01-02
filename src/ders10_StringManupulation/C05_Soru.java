package ders10_StringManupulation;

public class C05_Soru {
    public static void main(String[] args) {
        /*
        mail kontrolü yapan bir program hazirlayin
        1- mail @ işareti içermiyorsa "geçersiz email"
        2- @gmail.com içermiyorsa  "gmail adresi giriniz"
        3- @gmİL.COM İLE BİTMİYORSA "yazım hatası"
        şeklinde sonuç yazdırın

         */
        String email="ahmet@gmail.com";
        if (!email.contains("@")){
            System.out.println("gecersiz email");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("gmail adresi giriniz");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("yazim hatasi");
        }else {
            System.out.println("email basari ile kaydedildi");
        }

        }
    }

