package Homework_2.Project1;

import java.util.Scanner;

import static Homework_2.Project1.B.method_1;

public class C {
    public static void main(String[] args) {
        method_1();
        System.out.println(method_2());

    }

    public static int a, b, c, newa;

    public static void method_1(){
        System.out.print("insert : ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
    }

    public static int method_2(){
        return Math.abs(a) % 10;

    }


}
