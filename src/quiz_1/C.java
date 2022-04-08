package quiz_1;

import java.util.Scanner;

public class C {
    public static int a,b;

    public void method_1(){
        System.out.print("insert : ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
    }
    public int method_2(){
        int digit, sum = 0;

        while(a != 0) {
            digit = a % 10;
            if(digit % 2 == 0)
                sum = sum + digit;
            a = a / 10;
        }
        return sum;
    }
    public int method_3(){
        int mult=1;
        for (int i = 1; i <= b; i++)
            if (b % i == 0){
                mult *= i;
//                System.out.println(i);
            }
        return mult;
    }
    public void method_4(){
//        System.out.println(this.method_2());
//        System.out.println(this.method_3());
        int k = this.method_2()+this.method_3();
        System.out.println(k);
    }
}
