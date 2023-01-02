package ders13_nestedForLoop_methodOlusturma;

public class C06_NestedForLoopUcgen {
    public static void main(String[] args) {
        /*
        nested for loop kullanarak aşağıdaki şekli hazırlayın
        1
        2 4
        3 6 9
        4 8 12 16
        5 10 15 20 25
         */

        for(int i=1; i<=5; i++){      //5 satır 1den 5 e
            for (int j=1; j<=i; j++){   // 1den başlayacak üçgen olabilmesi için i ye 1.satırda 1 element 2.satırda 2 element...
                System.out.print(i*j +" ");  //i*j oldu
            }
            System.out.println("");
        }
    }
}
