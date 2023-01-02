package ders33_inheritanceDataTypeKullanimi_overriding;


public class Corolla extends BToyota  {
    String model="Corolla";
    String uretimYeri="Turkiye";
    int yil=2023;

    public static void main(String[] args) {
        /*
        bir obje olusturulurken data turu
        ve constructor ayni class'dan ise
        bir variable in degerini bulmak icin
        o classa gideriz.
        o classda yoksa sırasıyla parent classlara bakilir
        ilk bulunan kullanılır.
         */

        Corolla corolla1=new Corolla(); //data türü orolla obje corolla
        System.out.println(corolla1.model); //corolla
        System.out.println(corolla1.uretimYeri); //corolla
        System.out.println(corolla1.yil); //corolla
        System.out.println(corolla1.marka); //Btoyota
        System.out.println(corolla1.motor); //araba
        System.out.println(corolla1.plaka); //araba
        System.out.println(corolla1.yakit); // Btoyota

        BToyota corolla2=new Corolla(); //data türü btoyota obje corolla
        /*
        obje olusturulurken
        data turu ve constructor farklı se
        VARIABLE ın deerini bulmak icin
        data turu olan classa dlr
        varsa kullanılır, yoksa o classın parentına bakılır
        bulunmazsa CTE  verir.(ama geri vites yapmaz)
         */

        System.out.println(corolla2.model); //Btoyota
        //System.out.println(corolla2.uretimYeri); //CTE
        System.out.println(corolla2.yil); //Btoyota
        System.out.println(corolla2.marka); //Btoyota
        System.out.println(corolla2.motor); //araba
        System.out.println(corolla2.plaka); //araba
        System.out.println(corolla2.yakit); // Btoyota


        Araba corolla3=new Corolla(); //data türü araba obje corolla constructor corolla
        //System.out.println(corolla3.model); //CTE
        //System.out.println(corolla3.uretimYeri); //CTE
        //System.out.println(corolla3.yil); //CTE
        //System.out.println(corolla3.marka); //CTE
        System.out.println(corolla3.motor); //araba
        System.out.println(corolla3.plaka); //araba
        System.out.println(corolla3.yakit); // ARaba

        BToyota toyota1=new BToyota();// data turu btoyota obje toyota
        System.out.println(toyota1.marka); //BToyota
        System.out.println(toyota1.model);//BToyota
        System.out.println(toyota1.motor);//araba
        System.out.println(toyota1.plaka);//araba
        System.out.println(toyota1.yil);//BToyota
        System.out.println(toyota1.yakit);//BToyota

        Araba toyota2=new BToyota();
        //System.out.println(toyota2.marka); //cte
        //System.out.println(toyota2.model);//cte
        System.out.println(toyota2.motor);//araba
        System.out.println(toyota2.plaka);//araba
        //System.out.println(toyota2.yil);//cte
        System.out.println(toyota2.yakit);//araba

        Araba araba=new Araba();
        System.out.println(araba.motor); // Araba
        System.out.println(araba.plaka); // Araba
        System.out.println(araba.yakit); // Araba

    }
}
