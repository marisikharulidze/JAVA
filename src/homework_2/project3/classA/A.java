package homework_2.project3.classA;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class A {
    public static void main(String[] args) {
        method_1();
        method_2();
    }

    public static void method_1(){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] m = new int[size];
        for(int i = 0; i < size; i++){
            m[i] = scan.nextInt();
        }
        System.out.print ("[");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + m[i]);
        }
        System.out.print ("]");
    }
    public static void method_2(){
        int size = ThreadLocalRandom.current().nextInt(1, 15 + 1);
        int[] m = new int[size];
        for(int i = 0; i < size; i++){
            m[i] = ThreadLocalRandom.current().nextInt(0, 15 + 1);;
        }
        System.out.print ("[");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + m[i]);
        }
        System.out.print ("]");
    }

}
