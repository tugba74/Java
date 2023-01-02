package ders26_passByvalue_immutableClassas;


import java.util.ArrayList;
import java.util.List;

public class C06_ImmutableClasses {
    public static void main(String[] args) {

        String str="Java guzeldir";

        System.out.println(str.toUpperCase()); //JAVA GUZELDIR

        System.out.println(str); // Java guzeldir

        str.toLowerCase();

        System.out.println(str); // Java guzeldir

        //string immutable oldugu için method ile yapılan değişiklikler Stringi kalıcı değiştirmez


        List<String> harfler= new ArrayList<>();

        harfler.add("A");
        harfler.add("B");

        harfler.remove(0);
        System.out.println(harfler);

        //List ve array mutable oldukları icin method ile yapilan değişiklikler kalıcı olur
    }
}
