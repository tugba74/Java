package ders12_forLoops;

public class C01_ForLoops {
    public static void main(String[] args) {

        String str="Java\n";
        System.out.println(str.repeat(10));

        //repeat olmasaydı

        //System.out.println(str);
        //System.out.println(str);
        //System.out.println(str);
        //System.out.println(str);
        //System.out.println(str);
        //System.out.println(str);
        //System.out.println(str);
        //System.out.println(str);
        //System.out.println(str);
        //System.out.println(str);

        //1!den 100e kadar sayıları yazdırın. bu zor olur

        for (int i=1; i<10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(""); //böyle olursa alta geçer alttaki problemi çözümü

        //iki basamaklı sayılardan 7 ile bölünebilenleri yan yana yazdırın

        for (int i=10; i<100 ; i++){
        if (i%7==0) System.out.print(i +" ");
        }
        System.out.println("");

        //13 den başlayarak 100e kadar 7şer 7şer artırıp yazdıralım

        for(int i=13; i<=100 ; i+=7) {
            System.out.print(i+" ");
        }
        System.out.println("");


        //


            for(int i=1; i<=5; i++) {

                for(int j=(5-i); j>1; j--) {

                    System.out.print(i+j);

                }

                System.out.println();

            }

        }
    }

