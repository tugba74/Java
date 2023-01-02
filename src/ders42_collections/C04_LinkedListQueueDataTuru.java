package ders42_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedListQueueDataTuru {
    public static void main(String[] args) {

        Queue<String>q1=new LinkedList<>();
        q1.add("H");
        q1.add("Y"); //[H, Y]

        q1.offer("K"); //[H, Y, K]
        //kapasite sinirlamasi yapmadiginiz surece add() ile ayni islemi yapar

        System.out.println(q1.remove());
        //Queue eklemeyi sona yapıp, kullanmayi bastan yaptigi icin
        //parametre girmediğimizde bastaki elemanı remove eder ve bize döndürür.
        //boş Queue olsaydı [] bunu verirdi.


        System.out.println(q1);

        System.out.println(q1.remove("K"));//true
         q1.remove(); // bos queue kaldi.
        q1.remove(); // bos queue da remove kullanılırsa Queue boş liste olduğundan NoSuchElementEXception verir.


        System.out.println(q1.poll()); // null
        //q1.poll() remove ile aynı işlemi yapar yani bastaki elemanı siler ve bize döndürür.
        //aralarındaki fark boş Queue'da çalıştırıldıklarında
        //remove exception fırlatırken, poll exception fırlatmaz

        q1.add("H");
        q1.add("Y"); //[H, Y]

        System.out.println("peek : "+q1.peek()); //H
        //silmeden queue'nun basindaki elementi bize getiriyor
        //eger queue boşsa null getirir.
        System.out.println("element : "+q1.element()); //H

        q1.remove();
        q1.remove(); //queue yi bosalttık

        q1.clear(); // queue'yu bosalttik
        System.out.println("peek : " + q1.peek()); // null
        // System.out.println("element : "+q1.element()); // exception


    }
}
