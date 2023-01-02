package ders19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C09_KullanicidanDegerAlarakArrayOlusturma {
    public static void main(String[] args) {

        //kullanıcıdan istedigi kadar sayı alıp bir array olusturun
        //kullanıcı eleman girisini bitirmek icin 0a bassın

        Scanner scan= new Scanner(System.in);
        int[] arr={0};  //icinde 0 olsun önemli değil
        int girilensayi=0;

        do {
            System.out.println("arraye eklemek icin bir tamsayi giriniz" +
                    "\nBitirmekicin 0'a basin");
            girilensayi=scan.nextInt();

            if (arr[0]==0) {
                arr[0] = girilensayi;
            }else if(girilensayi!=0){
                arr=C08_ArrayeElemanEKlemeMethodu.arrayeElemanEkle(arr,girilensayi);
            }

        }while (girilensayi!=0);
        System.out.println(Arrays.toString(arr));

    }
}
