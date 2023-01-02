package ders35_exceptions;

public class C02_ArithmeticException {
    public static void main(String[] args) {
        //verilen iki sayıyı birbirine bölüp
        //sonucun tamsayi kismini yazdirin

        int sayi1=20;
        int sayi2=0;

        try {
            //riskli oldugunu ongordugumuz kodlar
            System.out.println(sayi1/sayi2);
            System.out.println("Bkalım bu satır calisacak mı?");

        } catch (ArithmeticException e) {
            //catch (Exception e) ongordugumuz risk
            System.out.println("Sayi sifira bölünemez");
            //catch(0'dan sonraki { } catch blogu denir
            //beklenen risk gerceklestrilirse calisacak kodlar
        }

        /*
        bazı exceptionlar if else ile handle edilebiir ancak
        tüm exceptionlar için if else yeterli olmaz

         */
    }
}
