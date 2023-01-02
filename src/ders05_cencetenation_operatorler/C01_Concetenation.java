package ders05_cencetenation_operatorler;

public class C01_Concetenation {
    public static void main(String[] args) {

     //sadece asagida verilen variable ları kullanarak istenen degerleri yazdırın

     String s1= "Java";
     String s2= "Guzeldir";
     String s3= ""; //hiçlik sadece string özelliği kazandırı
     String s4=" "; //space

     int sayi1=4;
     int sayi2=3;

     //Java7 Güzeldir43
        System.out.println(s1+(sayi1+sayi2)+s4+s2+sayi1+sayi2);

       //34 Java
        System.out.println(s3+sayi2+sayi1+s4+s1);

      //7Java Güzeldir
        System.out.println(sayi1+sayi2+s1+s4+s2);

     // Java Guzeldir7

        System.out.println(s1+s4+s2+(sayi1+sayi2));

     //Java Guzeldir 12
        System.out.println(s1+s4+s2+s4+(sayi1*sayi2));

    }

}
