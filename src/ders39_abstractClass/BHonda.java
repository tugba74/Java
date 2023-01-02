package ders39_abstractClass;

public abstract class BHonda extends Araba{
    //Abstract bir classı parent edindiğimizde
    //iki alternatifimiz olur
    //1-Parentimiz olan Abstrat classdaki abstract methodları override etmek
    //2-proje yapimiz gerekiyorsa bu classı da abstract yapmak

    public void marka(){
        System.out.println("marka : Honda");
    }


    public abstract void yakit();

    public abstract void guvenlik();

    public void ozelTeknoloji (){
        System.out.println("Tum Hondalar");

}
}
