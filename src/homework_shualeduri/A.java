package homework_shualeduri;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class A {
    public int[] m = new int[15];

    public void method_1(){
        Scanner scan = new Scanner(System.in);
        int min, max, i ,randNum;

        System.out.print("input min value : ");
        min = scan.nextInt();
        System.out.print("input max value : ");
        max = scan.nextInt();

//        randNum = ThreadLocalRandom.current().nextInt(min,max+1);
        for(i=0; i<15; i++){
            m[i] = ThreadLocalRandom.current().nextInt(min,max+1);;
//            System.out.print(m[i]+",");
        }
    }
    public int method_2(){
        int sum = 0, i;
        for(i=0; i<15; i++){
            if(m[i] < i){
                sum += m[i];
            }
        }
        return sum;
    }
    public int method_3(){
        int mult = 1, i;
        for(i=0; i<15; i++){
            if(m[i] > i){
                mult *= m[i];
            }
        }
        return mult;
    }
    public void method_4(){
        int i;
        System.out.print("[");
        for(i=0; i<15; i++){
            if(m[i] % 2 == 0){
                System.out.print(m[i]+" ");
            }
        }
        System.out.print("]");

    }
}
