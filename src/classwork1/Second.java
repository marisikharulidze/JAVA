package classwork1;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Second construct = new Second();
        method_1();
    }

    public static int x;

    public Second(){
        System.out.print("insert : ");
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        System.out.println(x);
    }

    public static void method_1(){
        if(x%2 == 0) System.out.println("luwia");
        else System.out.println("kentia");
    }

}
