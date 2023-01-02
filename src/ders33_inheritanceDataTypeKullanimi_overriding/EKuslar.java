package ders33_inheritanceDataTypeKullanimi_overriding;

import javax.imageio.stream.ImageInputStream;

public class EKuslar extends DHayvanlar{



    protected void kanat( ) {
        System.out.println("Kuslar kanatlidirlar");
    }
    protected void solunum( ) {
        System.out.println("Kuslar akcigerle nefes alirlar");
    }
    protected void gaga( ) {
        System.out.println("Kuslarin gagalari vardir");
    }
    protected void cogalma( ) {
            System.out.println("Kuslar yumurtayla cogalirlar");



        DHayvanlar avci3=new FAvciKuslar(); //DATA TURU HAYVANLAR, AVCIKUSLAR CONSTRUCTOR.ÖNCE DATA TURU CLASSINA BAKIYORUZ
                                            // VARSA GUNCELİ VARMI DİYE BAKIYORUZ , YOKSA KABUL EDİYORUZ.
        avci3.beslenme(); //avci kuslar
        //avci3.gaga(); //CTE
        //avci3.pence(); //CTE
        avci3.hareket();//avci kuslar
        avci3.cogalma(); //kuslar
        //avci3.kanat(); //CTE DATA TURU CLASSINDA YOKSA BAŞKA CLASSALRA BAKILMAZ DİREKT CTE VERİR
        avci3.omur(); // hayvanlar
        avci3.solunum(); //kuslar

        /* METHOD'larla belirlenen özellikler
        en güncel bilgiyi bulurken veriable' ile belirlenen özellikler ilk buldugu degeri kullanır.
        bunun için METHOD'lara DİNAMİK , VERIABLE'lalara STATİK  Özelliklidir
         */

        /*
        variable da ilk buldugumuz özelliği kullanırız, methodlarda ise bulduğumuz anda bekler overriding guncelleme yapılmış
        mı diye bakarız.
        methodlar dinamik özellikler-en guncel olanını alır
        variable lar static özelliklerdir . ilk buldugunu alır
         */


    }

}
