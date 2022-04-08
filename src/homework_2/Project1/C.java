package homework_2.Project1;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        method_1();
        System.out.println(method_2());
        System.out.println(method_3());
        System.out.println(method_4());

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

    public static int method_3(){
        return Integer.parseInt(Integer.toString(b).substring(0, 1));
    }

    public static int method_4(){
        int sum = 0;
        while(c>0){
            int digit = c % 10 ;
            sum += digit;
            c /= 10;
        }
        return sum;
    }
}
