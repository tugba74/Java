package ders19_arrays;

import java.util.Arrays;

public class C05_StringSplitMethodu {
    public static void main(String[] args) {


        String str = "java gercekten cok cok guzel"; //split arrayi , ve bir boşluk veriyor

        //verilen stringte kç tane e harfi olduğunu bulunuz

        String[] eArrayi=str.split("e");
        System.out.println(Arrays.toString(eArrayi)); //[java g, rc, kt, n cok cok guz, l]
        System.out.println(eArrayi.length); //5 4 karakter 5 bölme şeklinde

        System.out.println("Metindeki e sayisi : " +(eArrayi.length-1));

        //2.yöntem
        //String'i "" ile split yaparak karakterlerine ayiralim
        /*

        String[] tumKarakterlerArr=str.split("");
        System.out.println(Arrays.toString(tumKarakterlerArr));

        int syac=0;
        //bir loop ile tüm karakterleri kontrol edelim

        for(int i=0; i<tumKarakterlerArr.length; i++){
            if (tumKarakterlerArr[i]);

         */
        }

    }

