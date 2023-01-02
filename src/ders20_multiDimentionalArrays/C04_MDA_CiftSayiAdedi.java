package ders20_multiDimentionalArrays;

public class C04_MDA_CiftSayiAdedi {
    public static void main(String[] args) {
        //verilen iki katlı bir integer arraydeki çift sayıyı bulan bir kod yazınız

        int[][] arr= {{4,6}, {3,5,8}, {1,0,4}};

        int sayac=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] %2 == 0){
                    sayac++;
                }
            }
        }
        System.out.println("Array'deki cif sayi adedi : " + sayac); //5
    }
}
