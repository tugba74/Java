package ders11_stringManupulation;

public class C05_repeat_trim {
    public static void main(String[] args) {

        String str="java guzeldir\n ";
        System.out.println(str.repeat(4));

        str= "   Java guzeldir   "; //basindaki ve sonundaki bosluklardan kurtulmak icin trim kulaniriz

        System.out.println(str.length()); //19
        str=str.trim();

        System.out.println(str.trim()); //"Java guzeldir"

        System.out.println(str.length()); //13



    }
}
