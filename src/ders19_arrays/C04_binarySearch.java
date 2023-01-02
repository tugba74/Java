package ders19_arrays;

import java.util.Arrays;

public class C04_binarySearch {
    public static void main(String[] args) {

        int[] arr= {1,8,9,3,7,2,5,8,1};

        System.out.println(Arrays.binarySearch(arr,8)); //6,index
        System.out.println(Arrays.binarySearch(arr,1)); //0
        System.out.println(Arrays.binarySearch(arr,5)); //-2
        System.out.println(Arrays.binarySearch(arr,9)); //-10
        /*
        bnary search methodunun doğru sonuçlar verebilmesi için
        öncelikle sort methodu kullanılmalıdır

        sort() kullanmadan binarySearch() ile yapilan

         */

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr,8)); //6
        System.out.println(Arrays.binarySearch(arr,1)); //1
        System.out.println(Arrays.binarySearch(arr,5)); //4
        System.out.println(Arrays.binarySearch(arr,9)); //8

        //arrayda olmayan bir eleman aratırsak
        //olmayan sayılar için eksi değerler verdi. olsaydı burada olurdu demek istiyoor
        //java önce o sayı arrayde olsa nerede olurdu onu bulur
        //sonra bulduğu bu SIRAyı eksi - işareti ile verir. -0 anlamsı olacağı için


        System.out.println(Arrays.binarySearch(arr,-3)); //-1 eksi işartei sayının bulunmadığını söylüyor. rakamda sırasını veriyor.
        System.out.println(Arrays.binarySearch(arr,4)); //-5
        System.out.println(Arrays.binarySearch(arr,10)); //-10
        System.out.println(Arrays.binarySearch(arr,100)); //-10


    }
}
