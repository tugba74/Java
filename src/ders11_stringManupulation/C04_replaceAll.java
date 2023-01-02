package ders11_stringManupulation;

public class C04_replaceAll {
    public static void main(String[] args) {
        //kullanıcının girdiği metinde harf dışında kalan tum
        //karakterleri temizleyen bir kod yazın
        //not: space  silinmemeli
        String input="Ja5+va cok 1*guzel";


        input=input.replaceAll ("\\d",""); // ja+va cok *guzel (dijitlerin yerine hiçlik)
        input=input.replace(" ","5"); // Ja+va5co5*guzel
        input=input.replaceAll ("\\W",""); // Java5cok5guzel
        input=input.replaceAll ("5"," ");

        System.out.println(input);
    }
}
