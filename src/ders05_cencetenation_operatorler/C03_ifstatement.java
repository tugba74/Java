package ders05_cencetenation_operatorler;

import java.util.Scanner;

public class C03_ifstatement {
    public static void main(String[] args) {

        // kullanicidan iki tamsayi alin
        // eger birinci sayi 100'den buyukse , "ilk sayi 100'den buyuk" yazdirin
        // eger ikinci sayi ciftse, "ikinci sayi cift yazdirin"
        // eger ilk sayi, ikinci sayidan buyukse , "ilk sayi daha buyuk" yazdirin
        int s1;
        int s2;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Lutfen iki tamsayi giriniz");
            s1 = scan.nextInt();
            s2 = scan.nextInt();
        }
        // eger birinci sayi 100'den buyukse , "ilk sayi 100'den buyuk" yazdirin
        if (s1>100){
            System.out.println("ilk sayi 100'den buyuk");
        }
        // eger ikinci sayi ciftse, "ikinci sayi cift yazdirin"
        if (s2%2==0){
            System.out.println("ikinci sayi cift");
        }
        // eger ilk sayi, ikinci sayidan buyukse , "ilk sayi daha buyuk" yazdirin
        if (s1>s2){
            System.out.println("ilk sayi daha buyuk");
        }
    }
}

