package homework_shualeduri;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FamilyBudget {
    public int getMoney() {return money;}
//    public void setMoney(int money) {this.money = money;}

    private int money = 15000;

    public void method(){
        if(getMoney() >= 40000) System.out.println("rich");
        else if(getMoney() >= 10000 && getMoney() < 40000) System.out.println("\n"+"average not rich or poor");
        else System.out.println("poor");
    }

    public void method_file(){

        try {
            File file = new File("budget.txt");
            file.createNewFile();
            String s = getMoney() + "\n";
            Files.write(Paths.get("budget.txt"), s.getBytes(), StandardOpenOption.APPEND);

        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
