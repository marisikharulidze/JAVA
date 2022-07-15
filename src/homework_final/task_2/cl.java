package homework_final.task_2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class cl {

    public static int money = 100;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Spin the weel?(Y/N)");
        char c;
        do {
            c = scan.next().charAt(0);
            if(c != 'N' && c == 'Y') play();
            else System.out.println("GAME ENDED");
        }while (c != 'N');
    }
    public static void play(){
        int[][] arr = new int[5][4];
        int sum = 0;

        for(int i=0; i<5; i++){
            for(int j=0; j<4; j++){
                int rand = ThreadLocalRandom.current().nextInt(0, 9);
                arr[i][j] = rand;
                sum += rand;
                System.out.print(arr[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

        if(sum>100){
            money += 5;
        }
        else money -= 10;
        System.out.println("----Money Left----"+money);
        System.out.println("====Sum===="+sum);
    }
}
