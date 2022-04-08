package homework_2.Project1;

import java.util.Scanner;

public class A {
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
    public static int method_2(){
        return a+b;
    }
    public static int method_3(){
        return a*b;
    }

}
