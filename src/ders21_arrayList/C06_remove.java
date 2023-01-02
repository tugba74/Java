package ders21_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_remove {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 3, 5, 3, 5, 2, 5, 1, 2, 4, 5, 3, 4, 5};

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {


            sayilar.add(arr[i]);
        }
        sayilar.remove(2);
        System.out.println(sayilar);
        sayilar.remove(5);
        System.out.println(sayilar); // [1, 2, 4, 3, 5, 3, 5, 2, 5, 1, 2, 4, 5, 3, 4, 5]
        /*
        lstemiz integerlardan olusuyorsa biz int bir deger yazdığında hep index kabul ettiğinden
        istediğimiz elementi obje olarak girip sildirmek için onceden tanımlamamız gerekir
         */
        Integer silinecekobje=4;
        sayilar.remove(silinecekobje);
        System.out.println(sayilar);
        //tüm 3 leri sildirin

        silinecekobje=3;

        while(sayilar.contains(silinecekobje)){
            sayilar.remove(silinecekobje);   //3 içeriyorsa sil

        }
        System.out.println(sayilar); //[1, 2, 5, 2, 5, 1, 2, 5, 4, 5]

        silinecekobje=10;
        System.out.println(sayilar.remove(silinecekobje)); //false

        sayilar.remove(20); //ındexoutofboundsException

    }
}
