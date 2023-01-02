package ders06_IfElseStatement;

import java.util.Scanner;

public class C05_IfElsetatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        double yas=scan.nextDouble();

        if (yas>=65) {
            System.out.println("yaşınız emeklilik için yeterli");
        }else{
            System.out.println("emekli olmak icin " + (65-yas) + " sene daha calismalisin");
        }
    }
}
