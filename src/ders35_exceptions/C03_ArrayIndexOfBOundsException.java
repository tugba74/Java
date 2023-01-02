package ders35_exceptions;

import java.util.Scanner;

public class C03_ArrayIndexOfBOundsException {

    public static void main(String[] args) {

        //kullanıcıdan bir index isteyin
        //verilen bir arrayden kullanıcının grdiği indexteki elemnti yazdırın

        int[] arr={3,4,5,6,7,8,2,3,4,5,6,8,9,1};

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir index giriniz");
        int index=scan.nextInt();

        try {
            System.out.println(arr[index]);

        } catch (ArrayIndexOutOfBoundsException hata) {

            System.out.println(hata.getMessage()); //Index 56 out of bound for length 12
            hata.printStackTrace();


        }

    }
}
