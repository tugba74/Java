package ders10_StringManupulation;

public class C03_startsWith {
    public static void main(String[] args) {
        String str= "manti acarken java ogrenilmez";
        System.out.println(str.startsWith("Manti")); //false kbüyük harfle başlıyor

        System.out.println(str.startsWith("m")); //true

        System.out.println(str.startsWith("manti acarken java ogrenilmez")); //true

        System.out.println(str.startsWith("")); //true başlamadan önce hiçlik var o nednele true

        System.out.println(str.startsWith("acarken", 6)); // 6.indexi bul 6.index ve sorası açarken ile mi başlıyor //true

        System.out.println(str.startsWith("manti",0)); // true 0.index ve sonrası manti ile mi başlıyor

        System.out.println(str.startsWith("java",10)); //10.index ve sonrası java ile başlıyor hayır //false


    }
}
