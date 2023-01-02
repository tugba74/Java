package ders04_matematikselislemler_incrementDecrement;

public class C06_Pre_Post_Increment {
    public static void main(String[] args) {
        int a=10;
        //a variable nin değerini yazdırıp sonra a nın değerini bir artırın

        System.out.println("a: "+a); //10
        a++;
        //a artık 11
        //a variable nın değerini 1 artırıp sonra yazdırıp

        int b=10;
        //a variable nın değerini 1 artırıp sonra yazdırıp
        b++;
        System.out.println("b: "+b); //11

        int c=10;
        //c variable nin değerini yazdırıp sonra c nın değerini bir artırın
        System.out.println("c: " +c++);

        int d=10;
        //d variable nin değerini yazdırıp sonra d nın değerini bir artırın
        System.out.println("d :" + ++d); //11

        /*
        c++ veya ++d yi yazdırma veya atama işleminde kullanırsanız
        c++ 'e post increment denir o satır için önce işlemi yapar sonra artrıma yapar
        ++d 'ye ise pre increment denir, önce artırma yapıp sonra işlemi yapar

        işlemin olduğu satırın bir alt satırına geldiğinde
        c'de D'de bie artmıştır.

         */


    }
}
