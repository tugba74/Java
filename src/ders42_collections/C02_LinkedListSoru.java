package ders42_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C02_LinkedListSoru {
    public static void main(String[] args) {
      /*
        Soru : Kullanicidan deger alarak iki String liste olusturun.
        Kullanici deger girmeyi birakmak icin 0’a basmalidir.

        Iki liste olustuktan sonra asagidaki sekilde bir output hazirlayin
        liste1 : …….
        liste2 : …….
        ortak elementler : …….
      */

        System.out.println("Once List1'i olusturulan");
        List<String>list1=kullanicidanAlarakListOlustur();
        System.out.println("Simdi ikincilisteyi olusturulan");
        List<String>list2=kullanicidanAlarakListOlustur();

        System.out.println("List1 : "+list1);
        System.out.println("List2 : "+list2);
        list1.retainAll(list2);
        System.out.println("Ortak elemanlar : " +list1);

    }
    public static List<String> kullanicidanAlarakListOlustur(){

        List<String>isimListesi=new LinkedList<>();
        Scanner scan=new Scanner(System.in);
        String isim="";
        while(!isim.equalsIgnoreCase("0")){ //0 a eşit olmadığı müddetçe çalışsın

        System.out.println("Listeye eklemek icin isim giriniz \nBitirmek icin 0'a basiniz");
        isim=scan.nextLine();

            if (!isim.equalsIgnoreCase("0")){
            isimListesi.add(isim);
        }

        }
        return isimListesi;
    }
}
