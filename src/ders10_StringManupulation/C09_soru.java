package ders10_StringManupulation;

public class C09_soru {
    public static void main(String[] args) {
        /*
        kullanıcıdan bir cümle ve metin alın
        cümlede metnin durumuna göre
        1-cümle metni içermiyor
        2-cümle metni sadece 1 kere içeriyor
        3-cümle metni birden fazla içeriyor
        seçeneklerinden uygun olanı yazdırın.

         */
        String cumle= "Java cok güzeldir cok"; //ilkindex 0 java için, son index 0
        String metin="cok";                    //çok için ilkindex 5, son index 18 birbirinden farklıysa demek ki birden azla kullanılmış
        int ilkIndex= cumle.indexOf(metin);
        int sonIndex=cumle.lastIndexOf(metin);

        if (ilkIndex==(-1)) {
            System.out.println("cümle metni içermiyor");
        }else if (ilkIndex==sonIndex) {
            System.out.println("cumle metni sadece 1 kere iceriyor");
        }else{
            System.out.println("cumle metni birden fazla iceriyor");

        }
    }
}
