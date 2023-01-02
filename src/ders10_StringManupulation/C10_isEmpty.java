package ders10_StringManupulation;

public class C10_isEmpty {
    public static void main(String[] args) {
        String str= "";
        System.out.println(str.isEmpty()); //true
        str="   ";
        System.out.println(str.isEmpty()); //false
        System.out.println(str.isBlank()); //true

        str="x";
        System.out.println(str.isEmpty()); //false İÇİNDE HİÇ BİR ŞEY YOK
        System.out.println(str.isBlank()); //false sadece boşluk var ise boşluklardan mı oluşur?


    }
}
