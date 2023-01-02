package ders28_varargs_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("Java candir.");

        System.out.println(sb.capacity()); //16+12=28
        System.out.println(sb.length()); // 12

        System.out.println(sb.reverse()); // .ridnac avaJ
        sb.reverse(); //Java candır

        sb.replace(0,4,"Ahmet Hoca");
        System.out.println(sb);
        sb.insert(18,"bu bir yalandır");
        System.out.println(sb);

        String str= "Java cok guzel";
        sb.insert(21,str,9,14);
        System.out.println(sb); //Ahmet Hoca candir.bu guzelbir yalandır

        // kapasite ve length'i esitlemek istersek
        sb.trimToSize();
        System.out.println(sb.capacity()); // 27
        System.out.println(sb.length()); // 27



    }
}
