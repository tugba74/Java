package ders37_exceptions;

public class C02_ClassCastException {
    public static void main(String[] args) {

        short sayi1=23;
        int sayi2=sayi1;

        short sayi3=24;
       // Integer sayi4=sayi3; integer ve short arasında parent-child ilişkisi olmadığından
        //                     birbirine atama yapamazsınız


        //aralarında parent-child ilişkisi olan class'lardan olusan objeler icin
        // auto-widening veya explicit-narrowing mumkundur

        Object obj=sayi3;
        System.out.println("Short'dan obje'ye cast edince : "+obj);

        Integer sayi5=(Integer)obj;
        System.out.println("Short datayı obje uzerinden integera cevirdik");




    }
}
