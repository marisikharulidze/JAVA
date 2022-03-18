package classwork;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        insert();

        switch(c) {
            case '+':
                System.out.println(addition());
                break;
            case '-':
                System.out.println(subtraction());
                break;
            case '*':
                System.out.println(multiplication());
                break;
            case '/':
                System.out.println(division());
                break;
            default:
                break;
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
