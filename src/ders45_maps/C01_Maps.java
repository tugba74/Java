package ders45_maps;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class C01_Maps {
    public static void main(String[] args) {
        //verilen bir cümlede kullanılan her bir harfi
        //ve o harfin kullanım mikartını
        //A=5 , b=3 ... gibi yazdırın

        String str= "Javayi balonu patlatmadan bitirelim";
        //J=1, a=7, v=1, y=1, i=4...

        String [] harflerArr =str.split("");

        System.out.println(Arrays.toString(harflerArr));
        Map<String,Integer> kullanimMiktariMap=new TreeMap<>();
        int sayac=1;

        //1-tum harfleri sirasi ile ele alacağiz
        for (int i=0; i<harflerArr.length; i++){

            // 2- ele aldigimiz harfin daha once Map'e eklenip eklenmediğini kontrol edelim
            if (kullanimMiktariMap.containsKey(harflerArr)) {
                continue;
            }else{
                //kod buraya geldiyse o harf henüz Mapê eklenmemeiştir.
                //o zaman bu harfin kullanim mikatrini bulmalıyız
                for (int j=i+1; j<harflerArr.length;j++){
                    if(harflerArr[j].equals(harflerArr[i])) {
                        sayac++;
                    }

                    }
                //sayma islemi bitti, Key ve Value'yu map'e ekleyelim
                kullanimMiktariMap.put(harflerArr[i],sayac);
                sayac=1;
                }

            }
        System.out.println(kullanimMiktariMap);
        }
    }

