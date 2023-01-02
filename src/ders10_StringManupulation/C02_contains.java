package ders10_StringManupulation;

public class C02_contains {
    public static void main(String[] args) {

        String str= "Java ile kodlama cok zevkli";

        System.out.println(str.contains("cok")); //true

        System.out.println(str.contains("odla")); //true (içinde odla geçiyor o nednele true

        System.out.println(str.contains("a")); //true
        // System.out.println(str.contains('s')); //parametre olarak char kabul etmez
        //charsequence : char dizisi (karakter dizisi)

        System.out.println(str.contains("java")); //false olur küçük harfli java yok

        String str2="Java";
        System.out.println(str.contains(str2)); //true (java güzeldirin içinde java var o nednele true

        String str3="234 Ali Can";
        // str3.contains(2); kabul etmez
        str3.contains ("2");

    }
}
