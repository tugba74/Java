package ders10_StringManupulation;

public class C06_indexOf {
    public static void main(String[] args) {
        String str = "Ahmet hoca ile hersey clear";

        str.indexOf("a");
        System.out.println(str.indexOf("a")); //9 ilk a nın indexini döndürür

        System.out.println(str.indexOf('c')); //8 ilk c nin indexi

        System.out.println(str.indexOf("hersey")); // 15 15.indexten başlıyor hersey yazısı

        System.out.println(str.indexOf("e",9)); // 13 9dan sonraki ilk e

        //13.index deki e'den bir sonraki e'nin indexini bulalım
        System.out.println(str.indexOf("e",14)); //16

        //cümledeki 2.c nin indexini yazdırın

        int ilkcindex=str.indexOf("c"); //8
        System.out.println(str.indexOf("c",ilkcindex+1)); //22

        System.out.println(str.indexOf("ali")); //index olarak integer döndürmesi bekleniyor. olmayan ne aratırasak -1 döner.

        System.out.println(str.indexOf("x")); //-1
    }
}
