package ders34_overriding_pollymophism;

public class BChild extends AParent{
    public void method1(){
        System.out.println("Child class method1");
    }

    public void method2(int a){

        //overriding olabilmesi icin
        //hem method ismi, hem de method signature ayni olmali
        System.out.println("child class method2");
    }

    public void method2(String isim){
        System.out.println("Child class String parametreli method2");
    }

    @Override
    public void method3() {
       // super.method3();
        //overriding varsa parent ve child class'daki
        //overridden ve overriding methodlardan sadece biri çalışır
        //eger ikisini birden calistirmak istersenzi
        //super.overriddenMethodIsmi yazilir

        /*
        overriding method @override rotasyonu ile işaretlenebilir.
        @override kullanılmayan overriding işleminde,
        parent class'daki overriden method silinirse
        hiç bir ssorun olmz

        Ancak  @override kullanılan overriding işleminde,
        parent class'daki overridden method silinirse
        Java CTE verir, boylece overridden methodun
        silinmesi engellenir
         */
    }
}

