package ders30_encapsulation;

public class Echild extends DParent {
    /*
    javadaki inheritnce ın insanlardan en büyük farkı:
    insanlarda parnet child edilebilr ama child parentını seçemez
    java da ise tam tersidir.
    -siz bir class olusturdugunuzda dha once olusturulmus classlardan
    tüm özelliklerini ihnerit etmek istediğiniz classı PARENT EDINIRSINIZ

    Bir class baska bir classı inherit etmek istediğinde
    extend keyword ile bunu deklare eder
     */
    public static void main(String[] args) {
       Echild child1=new Echild();
       child1.yas=30;
       child1.isim="Mahmut";
       child1.isEnough=false;
    }
}
