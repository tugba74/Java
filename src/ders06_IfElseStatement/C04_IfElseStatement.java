package ders06_IfElseStatement;

import java.util.Scanner;

public class C04_IfElseStatement {
    public static void main(String[] args) {

        //soru:4
        //
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char krk=scan.next().charAt(0);
        if (krk >='A' && krk <='Z') {
            System.out.println("Büyük Harf");
        }else {
            System.out.println("Büyük harf değil");
        }




    }
}
