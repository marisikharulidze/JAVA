package classwork;

import java.util.Scanner;

public class Calculator {
    public static void calc(){
        insert();

        switch(c) {
            case '+' -> System.out.println(addition());
            case '-' -> System.out.println(subtraction());
            case '*' -> System.out.println(multiplication());
            case '/' -> System.out.println(division());
        }
    }

    public static int a, b;
    public static char c;

    public static void insert(){
        Scanner scan = new Scanner(System.in);
        System.out.print("insert first number : ");
        a = scan.nextInt();
        System.out.print("insert char : ");
        c = scan.next().charAt(0);
        System.out.print("insert second number : ");
        b = scan.nextInt();
    }
    public static int addition(){return a+b;}

    public static int subtraction(){return a-b;}

    public static int division(){return a/b;}

    public static int multiplication(){return a*b;}

}
