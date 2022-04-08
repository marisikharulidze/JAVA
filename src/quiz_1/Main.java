package quiz_1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.method_1();
        System.out.println(c.method_2());
        System.out.println(c.method_3());
        c.method_4();

//        A a = new A();
//        a.method_1();
//        a.method_2();
//        a.method_3();
//
//        B b = new B();
//        b.method_1();
//        System.out.println(b.method_2());
//
//        method();

    }
    public static void method(){
        int a, b, k;

        System.out.print("insert : ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();

        if(a>b){
            k = a;
            a = b;
            b = k;
//            System.out.println("a"+a);
//            System.out.println("b"+b);
            primeNum(a,b);
        }
        else {
            primeNum(a,b);
        }
    }
    public static void primeNum(int a,int b){
        int i, j , m=0,sm=0 ,allPrime=0, rand;

        for(i=0; i<20+1; i++){

            rand = ThreadLocalRandom.current().nextInt(a,b+1);
            m = rand/2;

            if(rand == 0 || rand == 1){
                System.out.println(rand+" is not prime number");
            }else{
                for(j=2; j<=m; j++){
                    if(rand%j == 0){
                        System.out.println(rand+" is not prime number");
                        sm = 1;
                        break;
                    }
                }
                if(sm == 0)  {
                    allPrime++;
                    System.out.println(rand+" is prime number");
                }
            }
        }
        System.out.println("Prime numbers : "+allPrime);
    }
}
