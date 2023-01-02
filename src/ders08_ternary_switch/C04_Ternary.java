package ders08_ternary_switch;


public class C04_Ternary {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir ucgenin 3 kenar
        //uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen” yazdirin,
        // degilse “Eskenar degil” yazdirin.

       int kenar1=10;
       int kenar2=12;
       int kenar3=10;

        System.out.println(kenar1==kenar2 && kenar2==kenar3 ? "Eskenar ucgen" : "Eskenar ucgen degil");

        //soru 5: kullanıcıdan iki sayı alın ve buyuk olmayan sayii yazdirin

        int sayi1=14;
        int sayi2=15;

        System.out.println(sayi1>sayi2 ? sayi2 :sayi1);
    }
}
