package shualeduri;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.ThreadLocalRandom;

public class PrimaryNumber {
    public static void main(String[] args) throws IOException {
        PrimaryNumber pn = new PrimaryNumber();
        pn.method1();
        pn.method2();
    }
    private int number;

    public int getNumber() {return number;   }

    public void setNumber(int number) {this.number = number;   }

    void method1(){
        setNumber(ThreadLocalRandom.current().nextInt(100, 200 + 1));
//        System.out.println(getNumber());
    }
    void method2() throws IOException {
        File file = new File("number.txt");
        if (file.exists()) {System.out.println("File already exists "+ file.getName());}
        else {
            file.createNewFile();
            System.out.printf("Successfully created new file: " + file.getName());
        }

        String num = getNumber()+"\n";
        Files.write(Paths.get("number.txt"), num.getBytes(), StandardOpenOption.APPEND);
    }
}
