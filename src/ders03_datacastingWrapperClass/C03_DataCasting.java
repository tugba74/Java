package ders03_datacastingWrapperClass;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz");
        int girilenSayi=scan.nextInt();
        byte donusensayi=(byte)girilenSayi;
        System.out.println("girdiğiniz" +girilenSayi + "'nin donusmus hali : " +donusensayi);

    }
}
