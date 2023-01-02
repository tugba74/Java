package ders47_mapsMethodlari;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C04_Soru {
    public static void main(String[] args) {

        //verilen bir cumlede kullanilan karakterleri
        //ve kaçar adet kullanıldıklarını yazdırın

        String str= "Javayi balonu patlatmadan bitirelim";
        //J=1, a=7, v=1, y=1, i=4...

        String [] strArr =str.split(""); //harflerine ayırıyoruz arraye atayarak

        Map<String,Integer> kullanimMiktarlariMap=new TreeMap<>();

       for(int i=0; i<strArr.length; i++){

           //ele aldıgım element Map de varsa kullanımmiktarını yani value yi 1 artır
           kullanimMiktarlariMap.computeIfPresent(strArr[i],(k,v)->v+1);

           //ele aldıgın element Map'de yoksa kullanım miktarı 1 olarak Map ekleyecegiz
           kullanimMiktarlariMap.putIfAbsent(strArr[i],1);
 }
        System.out.println(kullanimMiktarlariMap);
       //{ =3, J=1, a=7, b=2, d=1, e=1, i=4, l=3, m=2, n=2, o=1, p=1, r=1, t=3, u=1, v=1, y=1}
    }
}
