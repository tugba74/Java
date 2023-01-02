package ders06_IfElseStatement;

public class C10_IfElseIFStatement {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.


        char cinsiyet='K';
        int yas=60;
        if (cinsiyet=='E' && yas>65) {
            System.out.println("emekli olabilirsin");

        } else if (cinsiyet=='E' && yas<65 && yas>15) {
            System.out.println("emekli olmak için daha" + (65 - yas) + "sene calismalisin");
        } else if (cinsiyet=='K' && yas<60) {
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet=='K' && yas<60 && yas>15) {
                System.out.println("Emekli olmak için daha " +(60-yas)+ "sene calismalisin");

        }else{
            System.out.println("geçersiz giriş");


        }

    }
}
