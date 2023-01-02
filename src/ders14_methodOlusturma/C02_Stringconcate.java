package ders14_methodOlusturma;

public class C02_Stringconcate {
    // verilen iki String'i parametre olarak kabul edip
    // bu iki String'i aralarinda bir bosluk olan tek bir String olarak
   // main method'a donduren bir method olusturun

    public static void main(String[] args) {
        String str1="JAva";
        String str2="Candir";

        System.out.println(birlestirMethodu(str1, str2));
        System.out.println(birlestirMethodu("bu da", "oldu"));
        System.out.println(birlestirMethodu("Anladınız","mi?"));

    }
    public static String birlestirMethodu(String str1, String str2){
        return str1+" "+str2;

    }
}
