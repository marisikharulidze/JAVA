package sweeft.task_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insert Number Of Stairs : ");
        int stearsCount = scan.nextInt();
        System.out.println("Number Of ways : " + countVariants(stearsCount));
    }

    static int fib(int n) {
        if (n <= 1)  return n;

        return fib(n - 1) + fib(n - 2);
    }

    static int countVariants(int stearsCount){
        return fib(stearsCount + 1);
    }
}
