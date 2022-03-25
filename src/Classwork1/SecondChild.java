package Classwork1;

import Homework_2.Constructor.First;

import java.util.Scanner;

public class SecondChild extends Second {
    public static void main(String[] args) {
        method_1();
        System.out.println(method_2());
    }

    public static int y;

    public static void method_1(){
        Scanner scan = new Scanner(System.in);
        Second construct = new Second();
        y = scan.nextInt();
    }
    public static int method_2(){return x + y;}
}
