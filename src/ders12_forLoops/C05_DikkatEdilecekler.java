package ders12_forLoops;

public class C05_DikkatEdilecekler {
    public static void main(String[] args) {
        /*
        sonsuz loop

       for (int i=0; i>-10; i++) {
            System.out.println(i+ " ");   sonsuz çalışır ram bitene kadar.
        */

        //ilk deger için bitiş sarti true olmuyorsa
        // for body 'si hiç devreye giremez
        //for (int i=0; i>10; i++){
            //System.out.println(i);


            //bir loopu sonunu beklemeden bitirmek istersek
            //kullanıcının verdiği bir sayının asal sayi olup olmadığını bulun

            int sayi=215;
            boolean asalMi=false;
            int bayrak=0;

            for(int i=2; i<sayi-1;i++) {
                if (sayi %i==0){
                    //askımız bitti
                    bayrak++;
                    break;
                }
            }
            System.out.println(bayrak);
            if (bayrak==0) {
                System.out.println("asal sayi");
            }else{
                System.out.println("asal sayi degil");
            }
        }
    }

