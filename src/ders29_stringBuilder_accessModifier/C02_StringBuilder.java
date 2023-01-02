package ders29_stringBuilder_accessModifier;

public class C02_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1= new StringBuilder("Java Candir");

        System.out.println(sb1.reverse());

        System.out.println("Tersii yazdirdiktan sonra sb1 : "+sb1);

        System.out.println(sb1.insert(0, "."));

        System.out.println(sb1);

        sb1.reverse();

        StringBuilder sb2= new StringBuilder("Java Candir.");

        String str="Java Candir.";

        System.out.println(sb1==sb2); //false içerik aynı olsa biel false verir
        System.out.println(sb1==sb1); //true sadece bir sb kendisi ile karşılaştırılırsa true verir
        // System.out.println(sb1==str); farkli iki data türü == ile karşılaştırırlamaz

        System.out.println(sb1.equals(sb2)); //içerik aynı olsa bie false verir
        System.out.println(sb1.equals(sb1)); //true sadece bir sb kendisi ile karşılaştırılırsa true verir
        System.out.println(sb1.equals(str)); //false CTE vermez fakat sonuc her zaman false 'dur

        System.out.println(sb1.compareTo(sb2)); //0
        StringBuilder sb3=new StringBuilder("Java Candir");
        System.out.println(sb1.compareTo(sb3)); //2
        /*
        CompareTo sadece tamamen aynı mı yoksa farklı mı sorususunun cevabını verir.
        tamamen aynı ise ==> 0 döner
        farklılık varsa ==> ilk farklı harfi buldugunda, farklı  harflerin arasında kaç harf ıldğunu verir.
         */

    }
}
