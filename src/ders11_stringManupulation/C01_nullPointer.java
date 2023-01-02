package ders11_stringManupulation;

public class C01_nullPointer {
    public static void main(String[] args) {
        String str1=" "; //yazdırınca boş ekran verir. hiçlik var
        //str1 e değer atanmıştır.

        System.out.println(str1); //hiçlik yazdırır //hiçlik boşluk değildir
        System.out.println(str1.concat ("Java")); //Java

        String str2;

        //str2 oluşturuldu ama değer atanmadı
        //System.out.println(str2); //yazdıramaz str2 nin değeri yok str2 ye değer atanmadı, CTE verir

        //System.out.println(str2.cancat("Java")); değer atanmadı için metodla kullanılamaz. değer atanmadı ki ne ile javayı toplayayım

        str2="Java candir";

        System.out.println(str2); // java candır
        System.out.println(str2.concat(".")); // java candır.

        String str3=null; //str3 e değer atanmamıştır.
                          // null pointer ile javaya değer atamadığımızın farkında olduğumuzu söylüyoruz.
        System.out.println(str3); // null işaretlendiğini yazdırır.

        System.out.println(str3.concat("Java")); //nullPointereExcepton
        // null ın görevi kodun çalışır durumda olmasını sağlıyor.

        System.out.println(str3+"Java"); //nullJava

        System.out.println(str3.toUpperCase()); //NullPointerException





    }
}
