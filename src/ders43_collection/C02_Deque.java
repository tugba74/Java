package ders43_collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.ListIterator;

public class C02_Deque {
    public static void main(String[] args) {

        Deque<String> urunler=new LinkedList<>();
        urunler.add("Nutella");
        urunler.add("Cikolatalı Gofret");
        urunler.add("Cokoprens");

        //tum uunlerin basına "Y" ekleyelim

       String eleman="";
       Deque geciciDeque=new LinkedList();

       while(eleman!=null){

           eleman=urunler.poll(); //poll metodu ilk elemnti silip bize döndürür.deque boş olursa null döndürür
           if (eleman!=null){
               eleman= "Y " + eleman;
               geciciDeque.add(eleman);
           }

       }
       urunler=geciciDeque;
        System.out.println(urunler);
    }
}
