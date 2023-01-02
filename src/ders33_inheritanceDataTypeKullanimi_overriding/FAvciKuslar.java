package ders33_inheritanceDataTypeKullanimi_overriding;

public class FAvciKuslar extends EKuslar{

    public void hareket() {
        System.out.println("Avci kuslar ucarlar");
    }
    public void beslenme() {
        System.out.println("Avci kuslar et yerler");
    }
    public void pence() {
        System.out.println("Avci kuslar pencelidir");
    }
    public void gaga() {
        System.out.println("Avci kuslar sivri gagalidir");
    }

    public static void main(String[] args) {

        FAvciKuslar avci1=new FAvciKuslar();
        /*
        bir obje olusturulurken constructor ve data turu aynı ise
         hangi METHOD'UN gecerli oldugunu bulmak icin
        o class'a gider varsa kullanırız
        yoksa sırası ile parentlara gider ilk buldugnu kullanır
         */

         avci1.beslenme(); //avci kuslar
         avci1.gaga(); //avci kuslar
         avci1.pence(); //avci kuslar
         avci1.hareket();//avci kuslar
         avci1.cogalma(); //kuslar
         avci1.kanat(); //kuslar
         avci1.omur(); // hayvanlar
         avci1.solunum(); //kuslar

        EKuslar avci2= new FAvciKuslar();  // kuslar data türü, avcikuslar constructor
        /*
        Bir obje oluşturulurken data türü ile constructor farklı ise hangi method'un
        geçerli olacağını bulmak için önce data türünün olduğu class
        ve parent'larına bakarak o method'u buluruz
        bulamaz isek CTE verir ,
        bulurisek HEMEN ÇALIŞTIRMAYIZ
        çalıştırmadan önce o method override edilmiş mi diye control ederiz
        override edilmiş ise override eden method'u calıştırırız.

         */

        avci2.beslenme(); //avci kuslar
        avci2.gaga(); //avci kuslar
        // avci2.pence(); //CTE
        avci2.hareket();//avci kuslar
        avci2.cogalma(); //kuslar
        avci2.kanat(); //kuslar
        avci2.omur(); // hayvanlar
        avci2.solunum(); //kuslar


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



        EKuslar kus1 = new EKuslar(); //data türü ile constructor aynı ise özelliği bulduğumuz an hemen yazarız
        kus1.cogalma(); //Kuslar
        kus1.gaga(); //Kuslar
        kus1.kanat(); //Kuslar
        kus1.hareket(); //HAyvanlar
        kus1.solunum();//Kuslar
        kus1.beslenme();//HAyvanlar
        kus1.omur();//HAyvanlar


 /*
        variable da ilk buldugumuz özelliği kullanırız, methodlarda ise bulduğumuz anda bekler overriding guncelleme yapılmış
        mı diye bakarız.
        methodlar dinamik özellikler-en guncel olanını alır
        variable lar static özelliklerdir . ilk buldugunu alır
         */



        DHayvanlar kus2 = new EKuslar(); //data türü Dhayvanlar constructor Ekuslar
        kus2.cogalma(); //Kuslar
        //kus2.gaga(); //CTE
        //kus2.kanat(); //CTE
        kus2.hareket(); //HAyvanlar
        kus2.solunum();//Kuslar
        kus2.beslenme();//HAyvanlar
        kus2.omur();//HAyvanlar

    }


}

