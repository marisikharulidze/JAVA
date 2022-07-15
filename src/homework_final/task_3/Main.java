package homework_final.task_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("src/file.txt");

            if (file.exists()) {System.out.println("File already exists"+ file.getName());}
            else {
                file.createNewFile();
            }

            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            System.out.println(number/10);
            System.out.println(number%10);

            FileWriter myWriter = new FileWriter("file.txt");
            myWriter.write("");
            myWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
