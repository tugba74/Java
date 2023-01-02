package ders32_;

public class Corolla extends BToyota {
    Corolla (int pc){
        super(5);
        System.out.println("parametreli corolla constructor");
    }
    Corolla(){

    }
    Corolla(String str){
        this();
        System.out.println("Parametreli Corolla constructor");

    }
        public static void main(String[] args) {
        Corolla corolla3=new Corolla("Ilker");


        Corolla corolla1=new Corolla();
        //parametresiz araba constructor
        //parametresiz Toyota Constructor
        Corolla corolla2=new Corolla(3); //constructor 1 çalıır
         //paramet
    }
}
