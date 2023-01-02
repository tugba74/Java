package ders17_scope;

public class C04_ObjectVariables {
    public static void main(String[] args) {
//c03 deki hastanenin ismini yazdırmak istesek
        System.out.println(C03_ObjectVariables.hastaneismi);
        System.out.println(C03_ObjectVariables.hastaSayisi);

        C03_ObjectVariables.hastaSayisi++;
        C03_ObjectVariables.hastaSayisi++;
        method1();
        System.out.println(C03_ObjectVariables.hastaSayisi);//23456
    }  //main metodun sonu herşey resetlenir. kod takibi main methoddan başlar.
       //main metodun sonuna gelindiğinde herşeybiter
       //tum değişimler resetlenir
       //variable değerleri baştaki hallerine döner
    public static void method1(){
        C03_ObjectVariables.hastaSayisi++;


    }
}