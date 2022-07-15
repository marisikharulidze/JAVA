package shualeduri;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task_2 {
    public static void main(String[] args){
        Task_2 task2 = new Task_2();
        task2.filee();
    }
    public void filee() {
        try {
            File file = new File("numbers.txt");

            if (file.exists()) {System.out.println("File already exists "+ file.getName());}
            else {
                file.createNewFile();
                System.out.printf("Successfully created new file: " + file.getName());
            }

            FileWriter myWriter = new FileWriter("numbers.txt");
            Scanner scan = new Scanner(System.in);
            System.out.print("insert n : ");
            int n = scan.nextInt();
            for(int i=0; i<n; i++){
                int x = ThreadLocalRandom.current().nextInt(-12, 23 + 1);
                myWriter.write(x+" ");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

            Scanner scanner = new Scanner(new File(String.valueOf(file)));
            int sum = 0;
            while (scanner.hasNextInt()) {
                sum += scanner.nextInt();
            }
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
