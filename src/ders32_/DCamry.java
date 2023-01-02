package ders32_;

public class DCamry extends BToyota{

    DCamry (String pc){
        super("Deniz");
        System.out.println("String parametreli Camry");
    }
    DCamry(){

    }

    public static void main(String[] args) {
       //eğer kullanılan argumente uygun bir consrtuctor
       //parent clas da yoksa CTE olur

        DCamry camry2=new DCamry("celal");
        //parametreli araba constructor
        //string parametreli toyota
        //string parametreli Camry

        System.out.println("===========");
        DCamry camry1=new DCamry(); //1

    }
}


//default constructor kullanılıyor
//ilk satırda super();             //2==>A
//
