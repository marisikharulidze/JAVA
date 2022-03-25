package Classwork1;

import java.util.concurrent.ThreadLocalRandom;

public class Third {
    public static void main(String[] args) {

        int a, b, i, even=0, odd=0, rand;

        a = 1;
        b = 20;

        for(i=0; i<10; i++){
            rand = ThreadLocalRandom.current().nextInt(a,b+1);
            if(rand%2 == 0) even++;
            else odd++;
            System.out.print(rand + " ");
        }

        System.out.println();
        System.out.println("even : " + even);
        System.out.println("odd : " + odd);
    }


}
