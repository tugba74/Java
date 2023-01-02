package ders04_matematikselislemler_incrementDecrement;

public class C07_Pre_Post_Increment {
    public static void main(String[] args) {

        int a = 10;
        int b = a++;

        int c = ++b;
        System.out.println("a: " + a + ", b:" + b + ",c: " + c);
        //a=11 b=11 c=11

        a = 20;

        b = ++a;

        c = a++;

        System.out.println("a: " + a + ", b:" + b + ",c: " + c);

        a = 30;
        System.out.println(a++); //30 //konsolda görünen
        System.out.println(--a); //30
        System.out.println(a--); //30
        System.out.println(a); //29

    }
}
