package ders08_ternary_switch;

public class C02_Ternary {
    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "ali";

        //verilen iki metin birbiri ile aynı ise "metinler aynı"
        //farlı ise "metinler farklı" yazdırın.

        if (str1.equals(str2)){
            System.out.println("Metinler ayni");
        }else {
            System.out.println("Metinler farkli");
        }
        System.out.println(str1.equals(str2) ? "Metinler ayni" : "Metinler farkli");
    }
}