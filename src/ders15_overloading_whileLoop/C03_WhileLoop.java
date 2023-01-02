package ders15_overloading_whileLoop;

public class C03_WhileLoop {
    public static void main(String[] args) {

        // iki basamaklı sayıları aralarında bir boşluk olacak şekilde yan yana yazdırın.

        for(int i=10; i<=99; i++) {
            System.out.print(i +" ");
        }
        //while loop ile yaparsak
        int a=10;
        while(a<100);
        System.out.println(a+" ");
        a++;      //artış miktarı unutulursa sonsuz loop oluşur
    }
}
