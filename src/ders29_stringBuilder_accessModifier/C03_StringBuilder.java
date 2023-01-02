package ders29_stringBuilder_accessModifier;

public class C03_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java ne kadar guzel");

        System.out.println(sb.substring(4)); //ne kadar guzel

        System.out.println(sb); //Java ne kadar guzel---değişmedi çünkü atama yapılmadı

        //sb=sb.substring(0,4); esitliği sonu stringbuilder, sagı ise String
        //                      Java non-primitive datalarda casting yapmaz
        // aynı not Integer,Byte ve short gibi sayi barindiran non-primitive'ler icin de gecerlidir.
        //sb guzel kelimesi icerior mu
        /*
        StringBuilder da olmayan, String classında bulunan methodları kullanmak isterseniz
        once toString() ile String'e cevirip, sonra String maniulation yapilabilir

         */

        System.out.println(sb.toString().compareTo("guzel")); //true

        sb.setCharAt(5,'N');
        System.out.println(sb);
    }
}
