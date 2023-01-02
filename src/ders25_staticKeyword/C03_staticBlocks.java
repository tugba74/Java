package ders25_staticKeyword;

public class C03_staticBlocks {

    public static void main(String[] args) {
        System.out.println("main method calisti");
    }
    static {
        System.out.println("2.static blok calisti");
    }
    static {

        System.out.println("1.static blok calisti");
    }


}

//statik blok önce çalışır main methoddan bile önce .
//statikler kendi arasında ise en üstte olan önce çalışır.