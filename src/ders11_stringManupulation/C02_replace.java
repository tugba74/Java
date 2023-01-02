package ders11_stringManupulation;

public class C02_replace {
    public static void main(String[] args) {
        String str="Java candir";
        System.out.println(str.replace('a','A')); // JAvA cAndir

        System.out.println(str.replace(' ', '_')); //Java_candir

        System.out.println(str.replace("candir","cok guzeldir")); //java cok guzeldir

        System.out.println(str.replace(" ", "")); //Javacandr
         //Stringdeki tüm a'lari silin
        System.out.println(str.replace("a,","")); //Jv cndir

        //Java yerine hava, candir yerine çok güzel yazdıralım

        System.out.println(str.replace ("Java", "Hava").replace("candir", "cok guzel")); //hava cok guzel


        //sadece 1.a 'yi A yapin
        System.out.println(str.replaceFirst("a", "A")); //JAva candir

        System.out.println(str.replace("","_"));
        //_J_a_v_a_ _c_a_n_d_i_r

    }



}
