package sweeft.task_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(5);

        while(true){
            System.out.println("Enter the Element Which you want to remove");
            int a = sc.nextInt();

            if(al.contains(a)){
                int size = al.size();
                al.remove(size-1);
                System.out.println("Data Removed");
            }
            else System.out.println("Data Not found");

        }
    }
}