package ders17_scope;

public class C01_LocalVariables {
    public static void main(String[] args) {
        //bir methodun içerisinde olusturulan variable'ların scope'u
        //icinde olusturulduklari methoddur
        //o methodun dısından ULASILAMAZLAR


        int sayi=10;
        String isim="Ramazan";
        // System.out.println(dogruMu);

        for (int i=0; i<10; i++){
            String adres="Ankara";
            //bir loop içerisnde olusturulan variablelar sadece o loop icerisinde gecerlidir.
        }

        //System.out.println(adres); loopun dısında kulanılamıyor

        double pi; //(variable olusturduk deger atamadık)

       // System.out.println(pi); //deger atanmadı diye uyarı veriyor.
        //local variablelar deger atamadan olusturulabilir ancak KULLANILAMAZ
        //kullanmadan once deger atanmıs OLMALIDIR.
    }

    public static void method(){

        //sytem.out.println(sayi);
        //isim="tugay";

        boolean dogruMu=true;

    }
}
