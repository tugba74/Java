package ders14_methodOlusturma;

public class C04_Tekrar {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        //bu iki sayının carpim sonucunu yeni kod yazmadan konsola yazdırın.
        C01_Carpim.carpimMethodu (a,b); //200

        String c="Nasıl";
        String d="yani ?";
        //bu iki Stringi aralarında bir boşluk bırakacarak yazdırın
        System.out.println(C02_Stringconcate.birlestirMethodu(c, d)); //nasıl yani?

        String e="Bu da mı oldu?";
        // e stringini tersten yazdırın

        System.out.println(C03_StringTerseCevirme.stringiTerseCevir(e));

        //"Bu cümleyi terse cevirin"
        System.out.println(C03_StringTerseCevirme.stringiTerseCevir("Bu cümleyi terse cevirin"));

    }
}
