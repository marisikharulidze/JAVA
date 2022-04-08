package quiz_1;

import java.util.Scanner;

public class B extends A{
    public static int y;

    public B(){
        A a = new A();
        a.method_1();
        int x = a.x;
    }
    public void method_1(){
        System.out.print("insert : ");
        Scanner scan = new Scanner(System.in);
        y = scan.nextInt();
    }
    public int method_2(){
        return x+2*y;
    }
}
