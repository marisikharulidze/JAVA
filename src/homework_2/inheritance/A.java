package homework_2.inheritance;

import java.util.Scanner;

public class A {

    public int x, y;

    public void method_1(){
        Scanner scan = new Scanner(System.in);
        this.x = scan.nextInt();
        this.y = scan.nextInt();
    }

    public void method_2(){
        System.out.println(this.x);
    }
    public void method_3(){
        System.out.println(this.y);
    }
}
