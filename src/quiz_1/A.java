package quiz_1;

import java.util.concurrent.ThreadLocalRandom;

public class A {
    public static void main(String[] args) {
        System.out.println(x);
    }
    public static int x;

    public A(){
        System.out.println("„Hello A Class“");
    }
    public void method_1(){
        x = ThreadLocalRandom.current().nextInt(0,100+1);
    }
    public int method_2(){
        System.out.println(x-1);
        return 0;
    }
    public void method_3(){
        int i, m=0, sm=0;
        m = x/2;

        if(x == 0 || x == 1){
            System.out.println(x+" is not prime number");
        }else{
            for(i=2; i<=m; i++){
                if(x%i == 0){
                    System.out.println(x+" is not prime number");
                    sm = 1;
                    break;
                }
            }
            if(sm == 0)  { System.out.println(x+" is prime number"); }
        }
    }



}
