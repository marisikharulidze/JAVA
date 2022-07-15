package sweeft.task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Text");
        String text = scan.next();

        Palindrome paliandrome = new Palindrome();
        System.out.println(paliandrome.isPalindrome(text));
    }
}
