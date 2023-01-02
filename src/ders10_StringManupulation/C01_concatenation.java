package ders10_StringManupulation;

public class C01_concatenation {
    public static void main(String[] args) {
        String str1= "Java";
        String str2= "Güzeldir";
        boolean bl=true;
        int sayi=20;
        double dbl=3.54;
        System.out.println(str1+bl+sayi); //Javatrue20
        // System.out.println(bl+sayi);
        //string dışlındaki data türlerinde toplama yapmanıza izin vermeyebilir

        System.out.println(sayi+dbl); //23.54
        //System.out.println(str1.concat(bl));
        //concat() metodu sadece string variable'ları birleştirmek için kullanılır.
        System.out.println(str1.concat("").concat(str2)); //java güzeldir



    }
}
