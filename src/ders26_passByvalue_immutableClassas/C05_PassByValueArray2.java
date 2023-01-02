package ders26_passByvalue_immutableClassas;

import java.util.Arrays;

public class C05_PassByValueArray2 {
    public static void main(String[] args) {
        //bir metod olusturun
        // sayilar arrayinin uzunluğundan 2 fazla olan
        //ve elementlerin tamamı 5 olan yeni bir array olusturup
        //deger olarak sailar arrayine atayin ve sayilar arrayini yazdırın

        int[] sayilar= {3,4,5};
        arrayeYeniDegerAta(sayilar);
        System.out.println(Arrays.toString(sayilar));
    }
    public static void arrayeYeniDegerAta(int [] sayilar){

        int[] yeniArray = new int[sayilar.length+2];
        for (int i=0; i<yeniArray.length;i++){
            yeniArray[i]=5;

        }
        sayilar=yeniArray;
        System.out.println("method'da sayilarin son hali :" + Arrays.toString(sayilar));
    }
}
