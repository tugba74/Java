package ders04_matematikselislemler_incrementDecrement;

public class C08_Pre_Post_Increment {
    public static void main(String[] args) {

        int x=3;

        int y = 2* ++x;  //xi 1 artır 4 olur; 4*2 =8 y olur.

        int z=5 + y--;   // önce işlem y=8 di +5 ekle z=13; y yi 1 azalt y= 7 olur

        System.out.println(x+y+z); //24  4+7+13=24 olur
    }
}
