package ders45_maps;

import ders44_maps.MapDepo;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_Maps {
    public static void main(String[] args) {
        //ogrenciler map'inde subesi H olan ogrencilerin isim soyisim ve sınıflarını yazdıralım

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
        /*
        {101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz}
         */

        Set<Integer> ogrenciKeySet=ogrenciMap.keySet(); //bir map'deki key'leri Set olarak döndürür.
        //[101, 102, 103, 104, 105, 106]

        Collection<String>ogrenciValueCollection =ogrenciMap.values(); //bir map'deki tüm value'leri bize collection döndürür.

        System.out.println(ogrenciValueCollection);
        /*



         */

        /*



         */

    }
}
