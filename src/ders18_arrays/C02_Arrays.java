package ders18_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String[] arr={"Ali", "Ulus", "Nesrin"};

        // bu arrayin tüm elementlerini aralarında bir boşluk bırakarak yazdıralım

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");

        }
        System.out.println("");
        // bu array i array olarak yazdıralım.

        System.out.println(arr);
        //bu array bir obje /non primitive data oldugundan java referansını yazdırır.
        //array i array olarak yazdırmak isterseniz Arrays clssından yardım almalısınız

        System.out.println(Arrays.toString(arr)); //

    }
}
