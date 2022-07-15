package finall.task_3;

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

            System.out.println("Input number : ");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();

            if(number > 99 || number < 10){
                System.out.println("Number should consist of 2 digits ");
            }
            else {
                if(number/10 == number%10){
                    FileWriter write = new FileWriter("file.txt");
                    write.write(number/10+"\n");
                    write.write(number+"\n");
                    write.close();
                }
                else{
                    FileWriter write = new FileWriter("file.txt");
                    write.write(number+"\n");
                    write.write(number/10+"\n");
                    write.write(number%10+"\n");
                    write.write(String.valueOf(number%10)+number%10+"\n");
                    write.write(String.valueOf(number/10)+number/10+"\n");
                    write.write(String.valueOf(number%10)+number/10+"\n");
                    write.close();
                    System.out.println("Inserted");
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
