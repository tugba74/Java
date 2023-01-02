package ders14_methodOlusturma;

public class C05_SubstringOlustur {
    /*
    Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore baslangic index’i dahil, bitis index’i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun.
     - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
     - kullanici str’da olan index’lerden daha buyuk bir index girerse hata mesaji yazdirin.
     */
    public static void main(String[] args) {
        String input = "Java ne kadar guzel";
        int basIndexi = 5;
        int bitindexi = 7;
        kendiSubstringMethodumuz(input, basIndexi, bitindexi);
        kendiSubstringMethodumuz("Java", 1, 3); //av  1dahil 3 dahil değil
        kendiSubstringMethodumuz("Deneme", 6, 3); //baslangıc indexi, bitiş indexinden buyuk


    }

    public static void kendiSubstringMethodumuz(String input, int basIndexi, int bitIndexi) {
        if (basIndexi>bitIndexi){
            System.out.println("Baslangic indexi, bitis indexinden buyuk olamaz");
        } else if (bitIndexi>=input.length()) {
            System.out.println("Bitis indexi String'in sinirlari disinda");
        }else{
            //     baslangic ve bitis indexlerine gore baslangic index'i dahil,
            //     bitis index'i haric olacak sekilde
            //     aradaki harfleri yazdiran bir method olusturun.
            for (int i = basIndexi ; i <bitIndexi ; i++) {
                System.out.print(input.charAt(i));
            }
            System.out.println("");

            }
        }
    }
