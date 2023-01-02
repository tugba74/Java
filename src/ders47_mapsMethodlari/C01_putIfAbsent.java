package ders47_mapsMethodlari;

import java.util.HashMap;
import java.util.Map;

public class C01_putIfAbsent {
    public static void main(String[] args) {

        Map<String,Integer> mp1= new HashMap<>();

        mp1.put("A", 5);
        mp1.put("B", 3);
        mp1.put("C", 7);
        mp1.put("D", null);

        System.out.println(mp1.putIfAbsent("D", 9)); //null
        System.out.println(mp1);

        System.out.println(mp1.putIfAbsent("D", 15)); //9

        /*
        putIfAbsent(K,V) eğer K daha önce yoksa ekler ve null döner,
                         eğer K daha önce varsa eklemek istediğimiz yeni degeri eklemez
                            ve eski var olan degeri bize döndürür.
         */

        Map<Integer,String> mp2 =new HashMap<>();

        mp2.put(2, "S");
        System.out.println(mp2.putIfAbsent(3,"K"));//


    }
}
