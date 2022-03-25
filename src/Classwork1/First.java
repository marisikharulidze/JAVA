package Classwork1;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        method_1();
        System.out.println(method_2());
        System.out.println(method_3());
    }

    public static int a,b;

    public static void method_1(){
        System.out.print("insert : ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
    }
    public static int method_2(){return Math.abs(a) % 10;}

    public static int method_3(){return Integer.parseInt(Integer.toString(b).substring(0,1));}
}
