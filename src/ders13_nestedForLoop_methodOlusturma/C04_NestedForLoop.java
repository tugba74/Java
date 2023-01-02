package ders13_nestedForLoop_methodOlusturma;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        /*
        aşağıdaki şekli yazdıran bir kod yazın
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
         */
        for (int i = 1; i <= 4; i++) {   //dış loop satır sayısını kontrol ediyor

            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");

            }
            System.out.println(""); //iç loop bitince alt satıra geç

        }
    }
}
