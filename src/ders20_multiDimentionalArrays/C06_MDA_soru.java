package ders20_multiDimentionalArrays;

public class C06_MDA_soru {

    //soru-5 verilen 2 katlı bir arrayde
    //her birinner arrayin son elemantlerinin toplamını yazdıran
    //bir method oluşturun

    public static void main(String[] args) {

        int[][] arr={{5,7}, {5, 8, 9},{0,1}};
        int toplam=0;
    }

    public static void sonelementleritopla(int [][] arr){

        int toplam=0;

        for (int i=0; i<arr.length ; i++){
          toplam +=  arr[i][(arr[i].length-1)];
        }

    }
}
