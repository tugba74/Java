package ders09_StringManupulation;

import java.util.Locale;

public class C00_calisma {
    public static void main(String[] args) {
        String str="Benim uc cocugum var";
        System.out.println(str.substring(6)); // uc cocugum var
        System.out.println(str.length()); //20

        String sonharf=""+str.charAt(str.length()-1);

        sonharf=str.substring(str.length()-1);
        System.out.println(str.substring(str.length()-1).toUpperCase());
        System.out.println(str.substring(str.length()-1).toLowerCase());
        System.out.println(str.substring(str.length()-5).toLowerCase());
        System.out.println(str.substring(str.length()-2).toUpperCase());
        System.out.println(str.substring(0,5));
        System.out.println(str.substring(5,8));

        String isim="MuhammeT";
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        System.out.println(isim);
        System.out.println(isim.substring(4,5).toUpperCase());
        System.out.println(isim.substring(2,5));

    }
}
