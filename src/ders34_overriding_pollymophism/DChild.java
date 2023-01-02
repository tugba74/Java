package ders34_overriding_pollymophism;

public class DChild extends CParent{

    //overriding kuralları
    //1-access modifier method signature'a dahil olmadigindan
    // overridden ve overriding access modifier'lar farklı olabilir
    // child parentı sınırlandıramaz
    // yani overriding method'un access modifier'i
    // aynı veya daha geniş kapsamli olamalıdır
    // private--default--protected--public

    public void method1(){

    }

    //2-private ve static method'lar override edilemez
    // ayni isimde method olusturulunca java CTE vermez
    //ancak override isartei cikmaz ve
    //@override notasyonu kullanılmaz istenirse CTE olur
    //yani java bunları farklı classlardaki faarklı methodlar olarak kabul eder.
    public static void method(){

    }
    private void method3(){

    }
    //3-return type method signature'ına dahil olmadığından
    //farklı secilebilir
    //ancak return type void veya primitive ise aynı olmak zorundadır.
    //eger return type lar nonprimitive ise
    //Child classdaki return type, parent class'daki return type'in
    //child'i olmalıdır.

    public void method4(){

    }

    public Integer method5(){
        return 5;

    }
}
