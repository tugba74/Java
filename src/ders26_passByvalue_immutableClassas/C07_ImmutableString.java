package ders26_passByvalue_immutableClassas;

public class C07_ImmutableString {
    public static void main(String[] args) {

        String str="Java Candir";

        str=str.toUpperCase();
        System.out.println(str); // JAVA CANDIR
        /*
        ımmutable classalrdan olusturulan bir objenin degeri DEĞİŞTİRİRLEMEZ
        Eğer atama yaparsak java degerini degistirmez
        bunun yerine yeni br obje olusturur
        ve bu yeni atadiginiz degeri atar

        eski obje boşa çıkar ve garbage collector(çöpçü) tarafından silinmeyi bekler
         */
    }
}
