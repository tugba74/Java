package ders31_Inheritance;

public class GCorolla extends FToyota{

    String model="Corolla";
    String uretimYeri="Turkiye";

    GCorolla() {
        super();
        System.out.println("Corolla cons. calisti");
    }

    public static void main(String[] args) {
        GCorolla corolla1=new GCorolla();
        System.out.println(corolla1.marka); // Toyota
        /*
        bir child classatn obje olusturdugumuz da olusturulan obje sadece
        child classa ait özellikleri değil tüm parent classalrındaki
        özellikleri de taşır.

        Bir objenin bir classın özelliklerini taşıması için o obje olusturulurken,
        classa ait constructorın calismış olması gerekir.
        Yani child classındaki obje oluşturulurken
        tum parent classalardaki constructorlar da otomatik olarak calisir

        java bu islem icin söyle bir mekanizma geliştirmiştir
        Bir class olusturdugumuzda biz constructor olusturmasak da
        Javanın o classa default constructor koydugu GİBİ
        exteds keyword kullanan bir class da olusturulan her bir constructor'ın
        ilk satirna biz görmesek de super() constructor call koyar.

         */
    }
}
