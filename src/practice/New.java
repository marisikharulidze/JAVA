package practice;

import java.util.Random;

public class New {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int num = rand.nextInt(100);
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        System.out.println(num);
        System.out.println(i);
        System.out.println(j);
    }
}
