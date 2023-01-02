package ders37_exceptions;

public class C03_ThrowKeyword {
    public static void main(String[] args) {

        int sayi=1;
        System.out.println(sayi);
        try {
            sayi=2;
            System.out.println(sayi);
            if (sayi==2){ //sayi 2 oldugunda exception fırlatacak ve catch e kadar atlayacak
                throw new RuntimeException();
            }

            sayi=3;
            System.out.println(sayi);

            sayi=4;
            System.out.println(sayi);

            sayi=5;
            System.out.println(sayi);

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

        sayi=6;
        System.out.println(sayi);

    }
}
