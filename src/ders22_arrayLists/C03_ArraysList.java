package ders22_arrayLists;

import java.util.Arrays;
import java.util.List;

public class C03_ArraysList {
    public static void main(String[] args) {

      Integer[] arr={1,2,3};

        //verilen bir arrayi liste cevirmek icin
        //bir list olusturup, for loop ile elementleri tasimayi tavsiye ediyoruz

        List<Integer> arraydenList= Arrays.asList(arr); //(list esnek olduğu için faydalıydı)

        //bu yöntemin 2 negatif yönü vardır
        //1- bu şekilde olusturulan listler esnek uzunluğa ahip değillerdir.
        //   add, remove gibi özellikleri kullanmak isterseniz runtimeexception verir

        // arraydenList.add(10); // unsupprtedOperationException
        // arraydenList.remove (1); // unsupprtedOperationException

        // 2-bu yontem kaynak olan array ile yeni oluşlturulan listi birbirine bağlar
        //   birinde yaptığınız değişikliği  otomatik olraka diğerine de yansıtır

        System.out.println("Array : " + Arrays.toString(arr)); // [1, 2, 3]
        System.out.println("Liste : " + arraydenList); //[1, 2, 3]

        //sadece array in bir elemanını degiştirelim

        arr[0]=10;

        System.out.println();
    }
}
