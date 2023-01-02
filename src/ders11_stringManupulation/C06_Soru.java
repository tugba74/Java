package ders11_stringManupulation;

public class C06_Soru {
    public static void main(String[] args) {
         // kullanıcıdan bir cümle alın.
        //cülede ev  geçiyorsa, "home home sweet home" yazdırın
        //cümlede  is geçiyorsa "calışmak güzeldr" yazdırın
        //her ikisi de geçiyorsa "hem ev lazım hem iş"
        //hiçbirini içermiyorsa "çok çalışmam lazım" yazdırın

        String cumle= "amcama geldim, merdiven curumus";

        String cumlecopy=cumle.toLowerCase();
        if (cumlecopy.contains ("ev") && cumlecopy.contains("is")) {
            System.out.println("hem ev lazım hem is");
        }else if (cumlecopy.contains("ev")) {
            System.out.println("home home sweet home");
        }else if (cumlecopy.contains("is")) {
            System.out.println("calismak guzeldri");
        }else{
            System.out.println("çok çalışmak lazım");
        }

    }
}
