package sweeft.task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Amount : ");
        int amount = scan.nextInt();

        System.out.println(minSplit(amount));
    }

    static int minSplit(int amount){
        int numOfCoins = 0;

        if(amount / 50 > 0){
            numOfCoins += amount/50;
        }
        if(amount % 50 >= 20){
            numOfCoins += amount % 50 / 20;
        }
        if(amount % 20 >= 10){
            numOfCoins += amount % 20 / 10;
        }
        if(amount % 10 >= 5){
            numOfCoins += amount % 10 / 5;
        }
        if(amount % 5 >= 1){
            numOfCoins += amount % 5;
        }
        return numOfCoins ;
    }
}
