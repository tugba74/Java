package ders39_abstractClass;

public class CHondaCivic extends BHonda {
    @Override
    public void motor() {

    }

    @Override
    public void kasa() {

    }

    @Override
    public void tekerlek() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public void guvenlik() {

    }

    @Override
    public void abs() {

    }
    @Override
    public void klima() {
        System.out.println("Honda civic arabalar standart olarak klima kullanır");
    }

    public static void main(String[] args) {

        /*
       Abstract parent classlardaki abstract methodlar concrete
       child class'lar tarafindan mecburen override edilir

       Ancak abstract parentlardaki concrete methodları
       override etmek mecburi değildir.

       Eğer child class'a uyarlamak isterseniz override edebilirsiniz
       veya override etmeyip parent classdaki haliyle kullanabilirisniz.
         */
        CHondaCivic civic1=new CHondaCivic();
        civic1.abs(); //civic
        civic1.klima(); //civic
        civic1.marka(); //honda
        civic1.ozelTeknoloji(); //honda

    }
}
