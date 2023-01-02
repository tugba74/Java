package ders18_arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int[] arr1 = {2, 4, 6, 8, 10};

        //arrayin bir elementine ulaşmak ve update etmek istersek
        System.out.println(arr1[2]); //6

        arr1[3] = 20;  // 3,elementi 20 olarak ata
        System.out.println(arr1[3]); //20

        //arrayin boyutu
        System.out.println(arr1.length); //5

        //son elementi yazdırın
        System.out.println(arr1[arr1.length - 1]); //10

        //arrayin tüm elementlerini yazdırın

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");

        }

        //arrayin uzunluğu sonradan değiştirilemez
        // eger arrayde olmayan bir index e atama yapmak isterseniz
        //ArrayndexOutOfBoundaryException
        //bu hata compile time error CTE degil
        //run time error dür

         //arr1[5]=35      index 4 tür 5.index yok o nedenle hata veriri.

    }
}
