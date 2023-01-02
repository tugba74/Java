package ders13_nestedForLoop_methodOlusturma;

public class C02_StringTersineCevirme {
    public static void main(String[] args) {
        //soru 10 (interview)

        String input= "Java her gecen gun guzellesiyor";
        String tersInput=""; //boş string oluşturduk kaydedebilmek için

        for (int i=input.length()-1; i>=0 ;i--) {
            tersInput +=input.substring(i, i+1);

        }
        System.out.println("Ters hali :" +tersInput);

    }
}
