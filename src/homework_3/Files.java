package homework_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public void method(){
        try {
            File file = new File("data.txt");
            file.mkdir();
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("data.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
