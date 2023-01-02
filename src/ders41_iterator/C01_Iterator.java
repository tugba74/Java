package ders41_iterator;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {

    public static void main(String[] args) {
        //Java collections icerisindeki bazi classlar index desteklemez
        //bu durumda index kullanmadan collection içerisindeki tum elementlere ulasabilmek
        //ve onları update edebilmek için farklı ihityaçlarımız olur

        //List<> index yapısını detseklediği için boyle bır ıhtıyac duymaz
        //ancak bugunluk ındex kullanmadan List eementlerine ulasmaya
        //ve onları update etmeye calısalım

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        //ındex kullanmadan list'in tum elementelrin yazdırın
        for(Integer each:sayilar
        ){
            System.out.print(each +" ");
        }
        //Index kullanmadan list'in elementlerini 1'er artırın
        //index kullanmadan 25'den buyuk sayıları list'den silin

        for (Integer each:sayilar) {
            System.out.print(each+1 + " ");
        }
        System.out.println("");
        System.out.println(sayilar); //[10, 20, 30, 40]
        for (Integer each:sayilar){
            System.out.print(each +" ");
        }

    }
}
