package ders19_arrays;

import ders18_arrays.C03_ArrayElementleriniArtirma;
import ders18_arrays.C04_ArrayElemntleriToplama;
import ders18_arrays.C05_ArraydeElemanArama;
import ders18_arrays.C06_KullaniciyaarrayOlusturma;

import java.util.Arrays;

public class C03_MethodlariKullanma {
    public static void main(String[] args) {
        // verilen bir int array'in elemntelrini 2 artırın.

        int[] arr={2,3,4};
        arr= C03_ArrayElementleriniArtirma.elementleri2Artir(arr);
        System.out.println(Arrays.toString(arr)); //[4,5,6]

        // arr array'inin elementlerini toplayip sonucu yazdirin
        System.out.println(C04_ArrayElemntleriToplama.pozitifElementleriTopla(arr)); // 15

        //arr arraynde 10 element olarak var mı?
        C05_ArraydeElemanArama.elemanAra(arr,10); // aranan sayi array de yok

        // kullanıcıdan deger alarak bir array olusturma
        int[] yeniArr=C06_KullaniciyaarrayOlusturma.arrayOlustur();
        System.out.println(Arrays.toString(yeniArr));
    }
}
