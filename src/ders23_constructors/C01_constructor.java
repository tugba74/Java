package ders23_constructors;

import java.util.Scanner;

public class C01_constructor {
    public static void main(String[] args) {

        //Scanner class'ındaki method ve variable'ları (özellikleri)kullanmak için scan objesi olusturulur

        Scanner        scan=              new                   Scanner(System.in);
        //class adi  obje ismi  obje olusturmak için keyword    Scanner  constructor

        scan.nextInt();

        String str = new String ("Java Candir");
        String str2="Java ne guzel";

        str.toLowerCase();

    }
    public static void C01_constructor(){
        //method isimleri kucuk harfle baslar
        //class ismi ile aynı olmalıdır
        //return type var, bu methoddur, consructor olamaz

    }
}
