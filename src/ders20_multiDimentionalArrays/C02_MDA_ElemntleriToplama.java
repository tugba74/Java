package ders20_multiDimentionalArrays;

public class C02_MDA_ElemntleriToplama {

    public static void main(String[] args) {

        int[] arr1={3,5,7,8}; //23

        int toplam=0;

        for (int i=0; i <arr1.length; i++) {

            toplam +=arr1 [i];
        }
        System.out.println("Tek katli array elementler toplami : " +toplam);

        int [][] arr = {{1,2},{3,4,5},{7}};
        for (int i=0; i <arr1.length; i++) {
            for (int j=0; j <arr[i].length; j++) { // kaç katlı array ise o kadar for loop

                toplam += arr[i][j];

            }
        }
        System.out.println("2 katlı arrayin elementleri toplami:" +toplam); //22
    }

}
