package ders10_StringManupulation;

import java.util.Scanner;

public class C07_soru {
    public static void main(String[] args) {

        /*
        kullanıcıdan bir cümle ve metin alın
        cümlede metnin durumuna göre
        1-cümle metni içermiyor
        2-cümle metni sadece 1 kere içeriyor
        3-cümle metni birden fazla içeriyor
        seçeneklerinden uygun olanı yazdırın.

         */

     String cumle= "Java cok guzeldir cok.";
     String metin="cok";
     if(!cumle.contains(metin)){ //cümle metin içermiyor mu?
         System.out.println("cumle metni icermiyor");
     }else {
         int ilkIndex=cumle.indexOf(metin); //5
         int ikinciIndex=cumle.indexOf(metin, ilkIndex+1); //ya -1 olacak ya da bir index döner

         if (ikinciIndex==(-1)){
         System.out.println("cümle metni sadece 1 kere iceriyor");
     }else {
         System.out.println("cümle metni birden fazla iceriyor");
     }




        }


    }
}
