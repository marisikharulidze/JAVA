package Homework_2.Project1;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        method_1();
        System.out.println(method_2());
        System.out.println(method_3());
    }

    public static int a, b, c;

    public static void method_1(){
        System.out.print("insert : ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
    }
    public static int method_2(){
        return a>b && a>c ? a : b>c && b>a ? b : c;
    }
    public static int method_3(){
        return a<b && a<c ? a : b<c && b<a ? b : c;
    }
}
