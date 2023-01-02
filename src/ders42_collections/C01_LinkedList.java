package ders42_collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {
        LinkedList<String>ll1=new LinkedList<>();
        ll1.add("K");
        ll1.add("T");

        // LinkedList 3 tane interface'i implement etmiştir.
        //Lst,Queue; Deque interfaceleri
        //Dolayısıyla bu ınterfacelerden sonra elen ilk concrete class oldugundan
        //bu 3 interface deki tum abstract methodları override etmiştir.

        //LİnkedList olusturulurken secilen data turune gore
        //bu 3 interfaceden birinin ozelliklerini alabilir
        //veya data turu LinkedList secilirse, 3 interface'in ozelliklerini de toptan alır


        List<String> ll2 =new LinkedList<>();
        //Daha önceden arrayList olustururken List<> interface'ini data türü olarak
        //kullandıgımızdan bu sekılde olusturulan LinkedList'lerin ozellıklerını biliyoruz


        ll2.add("R"); //[R]

        ll2.add("Z"); // [R,Z]

        ll2.add(0,"A"); // [A,R,Z]

        ll2.addAll(2,ll1); // [A,R,K,T,Z]

        ll2.set(3,"M"); // [A,R,K,M,Z]

        System.out.println(ll2.get(1)); // R


        ll2.add("K");
        ll2.add("T");
        System.out.println(ll2);

        System.out.println(ll2.retainAll(ll1)); //true (ll1 dekileri tut diğerleri sil

        System.out.println(ll2); //[K,K,T]
        ll2.add("A");

        System.out.println(ll2.hashCode()); //3232590 hafızada tuttugu yerin kodunu verir. [K,K,T,A]

        //System.out.println(ll2.get(4)); // exception fırlattı
        System.out.println(ll2.subList(2, 4)); //2.indexten(2 dahil) 4.indexe kadar (4 dahil değil) getir.


    }
}
