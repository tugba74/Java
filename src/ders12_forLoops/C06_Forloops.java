package ders12_forLoops;

public class C06_Forloops {
    public static void main(String[] args) {

        /*


         */

        int sayi = 130;

        for (int i = 1; i <=sayi; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("fizzBuzz\n");
            } else if (i%3==0){
                System.out.print("fizz ");
            }else if (i%5==0) {
                System.out.print("Buzz ");
            }else{
                System.out.print(i +" ");


            }
        }
    }
}