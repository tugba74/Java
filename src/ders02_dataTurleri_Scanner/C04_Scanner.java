package ders02_dataTurleri_Scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan ismini alıp büyük harflerle yazdırın.

        // 1.adım : scan objesi oluşturma
        Scanner scan = new Scanner(System.in);

        // 2.adım : kullanıcıya ne istediğini yazdırma
        System.out.println("Lütfen adinizi giriniz");

        // 3.adım : kullanıcıdan istediğimiz bilginin türüne uygun bir variable oluşturup
        //          scanner methodlardından uygun olanını kullanarak alınan değeri
        //  variable a atayalım

        String kullaniciAdi = scan.next();
        System.out.println(kullaniciAdi.toUpperCase());


    }


}
