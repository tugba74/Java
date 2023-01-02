package ders28_varargs_stringBuilder;

public class C06_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java Guzeldir");

        System.out.println(sb.indexOf("a")); //ilk bulduğu a nın indexin yazdırır

        System.out.println(sb.indexOf("a",2)); //3
    }
}
