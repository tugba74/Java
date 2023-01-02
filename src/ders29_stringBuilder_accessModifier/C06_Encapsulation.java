package ders29_stringBuilder_accessModifier;

import java.util.ArrayList;
import java.util.List;

public class C06_Encapsulation {
    /*
    Büyük projelerde datayi gorme (Read) veya datayi degistirme (write) yetkilerini birbirinden
    bagimsiz olarak duzenlemek istenebilir

    Access modifier ile class uyelerine baska classlardan erisim sinirlandirilabilir

    ANCAK
    ulasilabilen dataya hem okuma hem yazma yapilabilirken
    ulasilamayan data ne okunabilir ne de degistirilebilir

    gercek hayatdaki ihityaclar dusunuldugunde
    Javaya yetki sinirlamayi uyarlamat istersek

    -Eger okuma ve yazma yetkisini birlikte vermek veya vermemek soz konusu ise access modifier kullanilir.

    -Eger okuma ve yazma yetkileri birbirirnden ayrilacaksa
    o zaman access modifier yeterli olmaz
    Encapsulation (getter ve setter method'lari kullanilmalidir.

     */
    //get ve set daha onceki java objeerinde karsimiza cikmisti

    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(5);

        //sayilar.get(1)=10; get okumaya izin var ama deger atamaya(yazmaya) izin yok

        // System.out.println(sayilar.set(1)); set varsa MUTLAKA deger atamalisin


    }
}
