package ders13_nestedForLoop_methodOlusturma;

public class C01_ForLoop {
    public static void main(String[] args) {
        //oru 9 (interview) kullanıcıdan bir string isteyin ve stringi tersten yazdırın

        String input = "Java ne kadar guzel";
        // lezug radak en avaJ

        for (int i = input.length() - 1; i >= 0; i--) {

            System.out.print(input.charAt(i));
        }
    }
}
