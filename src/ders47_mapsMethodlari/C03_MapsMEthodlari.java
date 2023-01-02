package ders47_mapsMethodlari;

import java.util.HashMap;
import java.util.Map;

public class C03_MapsMEthodlari {
    public static void main(String[] args) {
        Map<String,Integer> mp1= new HashMap<>();

        mp1.put("A", 5);
        mp1.put("B", 3);
        mp1.put("C", 7);

        //Ckey olarak varsa degerini 3 artır
        if(mp1.containsKey("C")){
            mp1.put("C", mp1.get("C")+3);
        }
        System.out.println(mp1); // {A=5, B=3, C=10}

        //B key olarak varsa degerini 2 ile carp

        mp1.computeIfPresent("B", (k,v) -> 2*v);
        System.out.println(mp1); // {A=5, B=6, C=10}

        // A key olaeak varsa degerini 5  azalt
        System.out.println(mp1.computeIfPresent("A", (k, v) -> v - 5));
        System.out.println(mp1); // {A=0, B=6, C=10}


        //Map de D yoksa value su 11 olaak şekilde ekleyelim

        if(!mp1.containsKey("D")){
            mp1.put ("D",11);
        }
        System.out.println(mp1); // {A=5, B=3, C=10, D=11}

        //E yoksa değeri 8 olarak ekle

        mp1.computeIfAbsent("E", v->8); //putIfAbsent daha mantıklı deger koymada
        System.out.println(mp1);

        //E nin degerini 4 artır
        mp1.compute("E", (k,v)-> v+4);
        System.out.println(mp1); // {A=0, B=6, C=10, D=11, E=12}

        //Rnin degerini 3 olarak ata
        mp1.compute("R", (k,v)-> v=3);
        System.out.println(mp1); //{A=0, R=3, B=6, C=10, D=11, E=12}

        mp1.compute("F", (k,v) ->v*3);
        System.out.println(mp1); //exception fırlatır NullPointerException
    }

}
