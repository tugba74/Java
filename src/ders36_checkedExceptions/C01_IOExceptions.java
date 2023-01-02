package ders36_checkedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C01_IOExceptions {
    public static void main(String[] args) throws FileNotFoundException {



        FileInputStream fis=new FileInputStream("src/ders36_checkedExceptions/Deneme.txt");

        FileOutputStream fos=new FileOutputStream("src/ders36_checkedExceptions/Deneme.txt");

        //Java ile bilgisayarımızdaki bir dosyaya ulasmak istersek
        //FileInputStream classından obje olusturup
        //o obje araciligiyla dosyayi kullanabiliriz

        //filenputstream olustururken ulasmak istediğimiz dosyanın
        //dosya yolunu parametre olarak girmeliyz

        /*
        Checked exception olusturma ihtimali olan kodları yazdığımızda
        java compile time arada bir hata ihtimali oldugunu görür
        ve kodun altını kırmızı olarak çizer

        bu durumdakırmızı çizgiyi kaldırmak için 2 yöntem vardır
        1- Exception'u TRY CATCH blogu ile handle etmek
        2- Java'ya sorun ihtimalinin farkında olduğumuzu ama kodumuza güvendiğimizi ve
        çalışmaya devam etmesini istediğimizi söylemek
        bunun için method signature'a method declarasyonu ile curly braces arasına throws keyword
        ve beklenen exceptıon turu yazılabilir

         */
    }
}
