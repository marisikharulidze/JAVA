package shualeduri;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task_1 implements  Itask_1{
    public static void main(String[] args) {
        Task_1 task1 = new Task_1();
        task1.method_1();
        task1.method_2();
        System.out.println("\nMin = " + task1.method_3());
        task1.method_4();
        task1.method_5();

    }

    public int a, b;
    public int[] m = new int[12];

    @Override
    public void method_1() {
        System.out.println("insert a and b : ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
    }
    @Override
    public void method_2() {
        int min = 0;
        int max = 10;
        for(int i=0; i<12; i++){
            int x = ThreadLocalRandom.current().nextInt(min, max + 1);
            m[i] = x;
        }

        System.out.print("[");
        for(int element : m){
            System.out.print(element+" ");
        }
        System.out.print("]");
    }
    public int method_3(){
        int min=0;
        for(int element : m){
            if(element > 0){
                min = Arrays.stream(m).min().getAsInt();
            }
        }
        return min;
    }
    public void method_4(){
        for(int i=0; i<12; i++){
            System.out.println(m[i] + " - index : "+i);
        }
    }
    public void method_5(){
        for(int i = 0; i < m.length; i++) {
            if (m[i] % 3 == 0) {
                System.out.println(m[i]);
            }
        }
    }
}
interface Itask_1{
    void method_1();
    void method_2();
}