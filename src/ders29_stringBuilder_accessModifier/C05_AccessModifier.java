package ders29_stringBuilder_accessModifier;

import ders22_arrayLists.C04_ForEachLoop;

public class C05_AccessModifier {

    public static void main(String[] args) {

        C04_AccessModifiers obj=new C04_AccessModifiers();

        obj.isim="Tugay";
        System.out.println(obj.isim); // Tugay
        //obj.sayi=20; private variable'lara baska classdan ulasılamaz

        C04_AccessModifiers obj2=new C04_AccessModifiers();
        System.out.println(obj2); //Ali
    }
}
