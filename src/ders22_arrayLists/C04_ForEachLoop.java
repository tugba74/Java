package ders22_arrayLists;

public class C04_ForEachLoop {
    public static void main(String[] args) {
        int[] arr= {3,5,7,8,4,2,6,9,6,4,5};

        //bu arraydeki tüm elementleri toplayalım
        int toplam=0;


        for (int i=0; i< arr.length; i++){

            if (arr[i]>5) { //sayı olarak eğer 5ten büyükse

                toplam += arr[i];
            }
        }
        System.out.println("for loop ile toplamı yazdır");

        //for each loop basit bir kurgu ile calisir
        //for-each loop'a 3 sayi söylemeniz lazım
        //1- hangi data turunde degişkenlerle ugrasacaksınız
        //2- loopun icerisinde herbir eleman geldiğinde hangi isimle islem yapacaksınız
        //3- hangi array veya collection dan elemanlar gelecek

        toplam=0;

        for (int each:arr) { //arr ye git

            if (each>5){
                toplam += each;

            }
        }
    }
}
