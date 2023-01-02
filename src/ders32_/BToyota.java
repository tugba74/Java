package ders32_;

public class BToyota extends Araba{
    BToyota(){
        System.out.println("Parametresiz Toyota constructor");
    }
    BToyota(int pt){
        System.out.println("Parametreli Toyota Constructor");

    }

    BToyota(String pt2) {
        super("Mehmet");
        System.out.println("String prametreli toyota");
    }

}
