package ders41_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {
    public static void main(String[] args) {


        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        //iterator kullanarak bu listeden 15 ile 35 arasındaki sayiları silin

        Iterator it1 = sayilar.iterator();
        while (it1.hasNext()) { //yanda elemean oldugu müddetçe

            Integer element = (Integer) it1.next(); //cast ederiz

            if (element > 15 && element < 35) { //15 ile 35 arasında ise o elemanı sil
                it1.remove(); //üzerinden geçtiği son elementi siler
            }
        }
        System.out.println(sayilar); // [10, 40]
        sayilar.add(20);
        sayilar.add(30);

        System.out.println(sayilar);

        // tüm elemntleri iterator yardımı ile silelim.
    Iterator it2=sayilar.iterator();
    it2.next();
    it2.remove(); //silmek için önce it2.next denmeli bunu dediğimizde java üzerinden geçtiği elemnti getirir
    it2.next()   ;
    it2.remove ();

    while(it2.hasNext()) {
        it2.next();
        it2.remove();
    }
        System.out.println(sayilar);
    }

}