package classwork;

import java.util.Scanner;

public class Calculator_2 {
    public static void main(String[] args) {
        insert();

//        switch(c) {
//            case '+':
//                System.out.println(addition());
//                break;
//            case '-':
//                System.out.println(subtraction());
//                break;
//            case '*':
//                System.out.println(multiplication());
//                break;
//            case '/':
//                System.out.println(division());
//                break;
//            default:
//                break;
//        }
    }

    public static int a, b;
    public static String str;

    public static void insert(){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        for(int i=0; i<str.length(); i++){
            System.out.println();
        }

    }
    public static int addition(){return a+b;}

    public static int subtraction(){return a-b;}

    public static int division(){return a/b;}

    public static int multiplication(){return a*b;}

}
