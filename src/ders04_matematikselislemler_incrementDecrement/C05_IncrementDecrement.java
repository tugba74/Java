package ders04_matematikselislemler_incrementDecrement;

public class C05_IncrementDecrement {
    public static void main(String[] args) {
        int sayi=10;

        //bu sayıyı 3 artıralım ve yazdıralım
        sayi=sayi+3;

        sayi +=3;

        System.out.println(sayi); //16

        int s=10;
        //bu sayıyı 1 artirin

        s+=1;
        System.out.println(s); //12

        s++;
        System.out.println(s); //13

        ++s;
        System.out.println(s); //14

        int t=10;
        //bu sayının değerini bir eksiltelim

        t=t-1; //9
        t -=1; //8
        t--; //7
        --t; //6
        System.out.println(t);


    }
}
