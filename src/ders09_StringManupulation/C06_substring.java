package ders09_StringManupulation;

public class C06_substring {
    public static void main(String[] args) {
        String str="Java ogren, isi kap";
        System.out.println(str.substring(5)); // ogren, isi kap
        System.out.println(str.substring(0)); // java ogren, isi kap
        System.out.println(str.length()); //19

        //son karaktesi string olarak kaydedin
        String sonHarf=""+str.charAt(str.length()-1);

        sonHarf=str.substring(str.length()-1);
        System.out.println(sonHarf); //p
         //son indexteki karakteri upper case olarak yazdırın

        System.out.println(str.substring(str.length()-1).toUpperCase()); //P

        //son 3 harfi büyükharf olarak yazdırın.

        System.out.println(str.substring(str.length()-3).toUpperCase()); //KAP
    }

}
