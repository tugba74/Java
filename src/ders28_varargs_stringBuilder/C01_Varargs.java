package ders28_varargs_stringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {
        topla(5,6); // 2 sayi 11
        topla(6,3,8); // 3 sayi 17
        topla(1,2,6,9); // 4 sayi 18
    }
    public static void topla (int sayi1,int sayi2) {
        System.out.println("2 sayinin toplam : " +(sayi1+sayi2));

    }
    private static void topla (int sayi1,int sayi2,int sayi3) {
        System.out.println("3 sayinin toplam : " + (sayi1 + sayi2 + sayi3));
    }
    private static void topla (int sayi1,int sayi2,int sayi3,int sayi4) {
        System.out.println("4 sayinin toplam : " + (sayi1 + sayi2 + sayi3));
    }

}
