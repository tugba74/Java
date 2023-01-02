package ders10_StringManupulation;

public class C04_endsWith {
    public static void main(String[] args) {

       String str = "Java heryerde guzel";

        System.out.println(str.endsWith("guzel")); //true bu string guzel ile mi bitiyor evet

        System.out.println(str.endsWith("")); //true

        System.out.println(str.endsWith ("Java heryerde guzel")); //true

    }
}
