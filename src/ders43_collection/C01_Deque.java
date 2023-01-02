package ders43_collection;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {
    public static void main(String[] args) {

        Deque<String> dq1=new LinkedList<>();

        dq1.add("K");
        dq1.add("B");
        dq1.addLast("F");
        dq1.addFirst("A");
        System.out.println(dq1.getFirst()); // A
        System.out.println(dq1.getLast()); // F

        System.out.println(dq1.remove()); //A
        System.out.println(dq1.poll()); //K
        System.out.println(dq1.removeLast()); //F
        System.out.println(dq1.remove()); //B artık deque boş

        //dq1.remove(); //NoSuchElementException
        System.out.println(dq1.poll()); //null
        //bos deque olmasına rağman exception fırlatmaz, eleman silemediğini için bize null döndürür

        dq1.add("K");
        dq1.add("B"); //[K, B]

        dq1.push("F"); //[F, K, B]
        //deque'in basına element ekler
        //eger deque ile ilgili sınırlandırma varsa ve yer kalmamıssa
        //iillegalStateException verir.

        System.out.println("pop : " +dq1.pop()); // F ==> ilk elementi siler ve bize döndürür. removeFirst() ile aynı işlevi görür

        System.out.println(dq1.element()); //K
        //ilk elementi silmeden bize döndürür,boş deque'de calisirsa exception fırlatır.

        System.out.println(dq1.peek()); //K
        //K silmeden baştaki elemti bize döndürür. boş deque'de calisirsa null döndürür.
        System.out.println(dq1.peekFirst()); //K
        System.out.println(dq1.peekLast()); //B

        System.out.println(dq1.offer("C")); //true  Liste==>[K,B,C]
        System.out.println(dq1.offerFirst("M")); // true liste ==> [M, K, B, C]



        System.out.println(dq1);

    }
}
