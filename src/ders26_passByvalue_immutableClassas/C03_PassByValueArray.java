package ders26_passByvalue_immutableClassas;

import java.sql.Array;
import java.util.Arrays;

public class C03_PassByValueArray {

    public static void main(String[] args) {
        // verilen bir arrayin elementlerini 5 artırıp
        //sonra yazdıran bir method olustur

        int[] arr={3,4,5};

        elementleri5Artir(arr);
        elementleri5Artir(arr);
        elementleri5Artir(arr);

        System.out.println("Method call'dan sonra main method icinde arr : " + Arrays.toString(arr));

    }
    public static void elementleri5Artir(int[] arr){

        for (int i=0; i< arr.length; i++) {

        }
        System.out.println(Arrays.toString(arr));
    }
}
