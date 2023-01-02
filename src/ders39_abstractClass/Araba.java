package ders39_abstractClass;

public abstract class Araba {
    //araba classını inherit eden tüm classlar
    //motor kasa ve tekerlek methodlarını override etmek zorunda kalsin
    //ancak abs, klima methodları opsiyonel olsun
    //isteyen child bu methodları override etsin, isteyen override etmesin

    public abstract void motor();

    public abstract void marka();


    public abstract void kasa();


    public abstract void tekerlek();

    public void abs(){
            System.out.println("Güvenlik artirmak isteyen arabalar abs kullanilmali");
        }

    public void klima(){
        System.out.println("Konfor artirmak icin");
    }


}
