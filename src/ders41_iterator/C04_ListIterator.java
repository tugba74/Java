package ders41_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_ListIterator {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        //===>  iterator kullanarak, listenin elementlerini sondan basa dogru yazdırın
        ListIterator lit=sayilar.listIterator();

        //once iterator'ı sona goturalim

        while (lit.hasNext()){
            lit.next();

        }

        //simdi sondan basa dogru gidelim, giderken lementleri yazdıralım

        while(lit.hasPrevious()){
            System.out.print(lit.previous() +" ");
        }

        
        //eger iteratorı nerede bıraktıgımızı hatırlayamazsak
        //iterator.nextIndex ile hangi indexin öncesinde oldugumuzu görebiliriz
        System.out.println("");
        System.out.println(lit.nextIndex());
        
        //====> Iterator kullanarak listenin tüm elentlerini 5 artırırın
        
        while(lit.hasNext()){
            //lit.next(); //sayıyı getiriyor


            lit.set((Integer)lit.next()+5); //sayıyı getir 5 ile tolayıp olustur ama cast etmemiz gerekiyor
        }
        System.out.println(sayilar);
        
        //====> iterotor kullanarak 40dan küçük elemntleri silin
        
        while(lit.hasPrevious()){ //ieratorumuz sonda idi onu basa getiriyoruz
            if ((Integer)lit.previous()<40) {
                lit.remove();
    }

}
        System.out.println(sayilar);
    }
}