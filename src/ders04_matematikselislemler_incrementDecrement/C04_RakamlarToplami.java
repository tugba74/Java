package ders04_matematikselislemler_incrementDecrement;

public class C04_RakamlarToplami {
    public static void main(String[] args) {
        //kullanıcının girdiği 4 basamaklı bir sayının
        //rakamlar toplamını veren bir kod yazınız
    int input=1453;

    int birlerBasamagi;
    int rakamlarToplami=0; //neden acaba?

    //1-birler basamağını al
    birlerBasamagi=input % 10; //3
    //2- birler basamağını rakamlar toplamına ekle
    rakamlarToplami = rakamlarToplami +birlerBasamagi; //3
    //3- birler basamağından kurtul
    input = input /10; //145

        birlerBasamagi = input % 10; // 5
        rakamlarToplami = rakamlarToplami +birlerBasamagi; // 8
        input = input/10; // 14

        birlerBasamagi = input % 10; // 4
        rakamlarToplami = rakamlarToplami +birlerBasamagi; // 12
        input = input/10; // 1

        birlerBasamagi = input % 10; // 1
        rakamlarToplami = rakamlarToplami +birlerBasamagi; // 13
        input = input/10; // 0
        System.out.println("verilen sayinin rakamlar toplami : " + rakamlarToplami);

    }
}
