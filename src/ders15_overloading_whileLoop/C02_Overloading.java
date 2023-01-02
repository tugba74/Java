package ders15_overloading_whileLoop;

public class C02_Overloading {
    public static void main(String[] args) {

        carpim(3,5); //method call sırasında method parantezine yazılanlara argument denir.
        carpim(3.4,2);
    }
     // Bir class da ayni isim ve ayni signatureâ sahip iki method olmaz.
    /*
    method overloading olan claslarda Java hangi methodu methodun calısagına
    su sekilde karar verir

    1- once method ismine bakar
    2- argument sayisi ile parametre sayisina bakar
    3-argument ve parametre uyumuna bakar
    4-minumum casting
     */


    public static void carpim(int sayi1, int sayi2){  //carpim int int

        System.out.println("Iki integer sayinin carpimi: "+sayi1*sayi2);

    }
    public static void carpim(int sayi3, int sayi4, int  sayi5) { //çarpım int int int

        System.out.println("uc integer sayinin carpimi: " + sayi3 * sayi4*sayi5);
    }
    public static void carpim(double sayi1, int sayi2) { //çarpım double int

        System.out.println("double - integer iki sayinin carpimi: " + sayi1 * sayi2);
    }
    public static void carpim(int sayi1, double sayi2) {  //carpim int double

        System.out.println("integer - double iki sayinin carpimi: " + sayi1 * sayi2);
    }
    public static void carpim(double sayi1, double sayi2) {  //carpim double double

        System.out.println("iki double sayinin carpimi: " + sayi1 * sayi2);
    }
}
