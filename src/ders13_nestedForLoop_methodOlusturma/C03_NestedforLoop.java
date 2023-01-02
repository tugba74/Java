package ders13_nestedForLoop_methodOlusturma;

public class C03_NestedforLoop {
    public static void main(String[] args) {
        // 1-4 arasındaki sayılar için çarpım tablosu oluşturalım

        //dış döngü satırları kontrol eder
        for (int i=1; i<=10; i++){

            //iç döngü her satırda olan degerleri kontrol eder
            for (int j=1 ; j<=10; j++){
                System.out.print(i*j +" ");
            }
            //iç döngü bittiğinde javayı alt satıra indirmeliyiz
            System.out.println(""); //hiçlik yazdırırsak bir alt satıra gider
        }



    }
}
