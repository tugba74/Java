package ders29_stringBuilder_accessModifier;

public class C04_AccessModifiers {


        String isim="Ali"; // access modifierı görünmüyor o zaman default access modifier gecerlidir
                           // bu class dan ve ders29 package'i icerisindeki diger class dan lıllanılabilir

      //  default int sayi=10; default access modifier yazilmaz, YAZILAMAZ
        //  yazmaya calısılırsa java CTE verir.

    private static int sayi=10;

    public static void main(String[] args) {
        System.out.println(sayi); //10
        sayi=20;


    }
}
