package ders28_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {

    topla(5,6); // 2 sayi 11
    topla(6,3,8); // 3 sayi 16
    topla(1,2,6,9); // 4 sayi 20
    topla(); //0
    topla(4,5,6,7,3,5,45,62,9,8,12,47);


        /*
        bir method da parametre sayisini sınırlandırmak istemezsek
        standart bir variable yerine varargs kullnırız

        varargs data türünün yanına ... konularak deklare edilir
        int... ==> sayısı belirli olmayan int parametreler olan bir arraydir.
         */


}
    private static void topla (int ...sayilar) {

        int toplamSonucu=0;
        for (int each: sayilar
            ){
            toplamSonucu += each;

        }
        System.out.println("Girilen sayilarin toplami :" +toplamSonucu);

    }
}
