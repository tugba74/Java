package ders06_IfElseStatement;

import java.util.Scanner;

public class C09_IfElseIfStatement {
    public static void main(String[] args) {
        //kullanıcıdan bir tamsayı alın
        //sayı negatif ise geçersiz ayı
        //tek basamaklı ise "rakam"
        // iki basamaklı ise "iki basamaklı sayı"
        // bunun dışındaki sayılar için "büyük sayı" yazdırın

        int sayi=62;

        if (sayi<0) {
            System.out.println("geçersiz sayı");

        }else if (sayi<10) {
            System.out.println("rakam");

        }else if (sayi<100) {
            System.out.println("iki basamaklı sayi");
        }else {
            System.out.println("büyük sayi");

        }
    }
}
