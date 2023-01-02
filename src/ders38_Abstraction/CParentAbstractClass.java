package ders38_Abstraction;

public abstract class CParentAbstractClass {

    /*
    Abstract bir class abstract metodlara sahip olabilir.
    Bir class'ı abstract yapmak için class declaration'ına abstract keyword eklenmelidir.

     */

    public void mecburiMethod1() {

    }
    public abstract void mecburiMethod2();

        //soyut (abstract) methodların bodysi olmaz

public void concreteMethod(){
    //bugüne kadar kullandıgımız normal methodlara
    //soyut olmayan method yerine concrete method denir.
}

    /*
    bir parent class da chld class'ların mutlaka override edeceği bir
    method olusturdugumuzda method body si gereksizleşir
    çünkü hiç çalışmayacaktır.
    1- abstract parent class'dan obje olusturulmayacağı için objeler icin bu method kullanılmaz
    2-chld class'lar da mecburen bu metodu override edeceklerinden bu methodun bodysi asla KULLANILMAYACAKTIR

    Java hiç kullanılmayacak bu body leri yazmamamıza imkan tanımıştır.
     */

    //child classların mutlaka overrde etmesini istediğimiz methodları
    //abstract olarak tanımlar ve body siz olarak olustururuz
}
