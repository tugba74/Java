package ders28_varargs_stringBuilder;

public class C04_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder(7);
        //bu kod yazıldıgında java 7 karaker alabilecek string builder oluşturur.

        System.out.println(sb.capacity()); //7
        System.out.println(sb.length()); //0 hiç bir değer atanmadığı için 0

        sb.append ("Java");

        System.out.println(sb); //java
        System.out.println(sb.capacity()); //7
        System.out.println(sb.length()); //4

        sb.append(" guzeldir.");

        System.out.println(sb); //java guzeldir.
        System.out.println(sb.capacity()); //7*2+2=16
        System.out.println(sb.length()); //14

        sb.append(" ona ne suphe");

        System.out.println(sb); //java guzeldir. ona ne suphe
        System.out.println(sb.capacity()); //16*2+2=34
        System.out.println(sb.length()); //27




    }
}
