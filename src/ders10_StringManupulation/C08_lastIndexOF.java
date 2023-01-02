package ders10_StringManupulation;

public class C08_lastIndexOF {
    public static void main(String[] args) {

        String str="Java hafiften beyin yakıyor";

        System.out.println(str.lastIndexOf("a")); //21 //sondan başlıor

        System.out.println(str.lastIndexOf('e')); // 15

        System.out.println(str.lastIndexOf("java")); // -1 küçük java olduğu için -1

        System.out.println(str.lastIndexOf("Java")); //0 //index her zaman baştan başlar

        System.out.println(str.lastIndexOf ("e",14)); //11

    }
}
