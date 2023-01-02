package ders21_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_ArraydenTekrarlarıSilme {

    public static void main(String[] args) {

        //verilen bir arraydeki tekrar eden sayıları
        //bir kere olacak şekilde düzenleyin

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        //bu soruyu arrayle yapmak çok zor
        //bunun yerine bu arrayin elemanlarını tek tek inceleyeyip
        //tekrarsız olanları bir liste atalım
        //en son o listteki elementleri içeren bir array oluşurup
        //yeni arrayi eski arraye değer olarak atayalım.

        List<Integer> tekrarsizListe = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!tekrarsizListe.contains(arr[i])) {
                tekrarsizListe.add(arr[i]);
            }
        }
        System.out.println("tekrarsiz Liste : " + tekrarsizListe); //[1, 2, 4, 3, 5]




    }
}

