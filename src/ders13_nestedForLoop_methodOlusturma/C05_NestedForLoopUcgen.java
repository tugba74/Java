package ders13_nestedForLoop_methodOlusturma;

public class C05_NestedForLoopUcgen {
    public static void main(String[] args) {

        /*
        nested for loop kullarak aşağıdaki şekli hazırlayın
        1
        1  2
        1  2  3
        1  2  3  4
        1  2  3  4  5
         */
        for (int i=0; i<=5; i++) { //satır
            for (int j=1; j<=i; j++){  //sütun 5 e kadar değil i ye kadar
                System.out.print(j+" ");

            }
            System.out.println("");
        }
    }
}
