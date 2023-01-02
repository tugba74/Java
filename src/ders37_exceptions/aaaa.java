package ders37_exceptions;

public class aaaa {
    public static void main(String[] args) {

        int num1 = 12;

        int num2 = 0;

        try {

            System.out.println(num1 / num2);

        } catch (ArithmeticException e) {

            System.out.println("Sifir ile bolme yapilmaz");

        } catch (Exception e) {

            System.out.println("Her exception'i yakala");

        }
    }
}