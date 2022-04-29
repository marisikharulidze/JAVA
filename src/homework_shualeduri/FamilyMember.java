package homework_shualeduri;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class FamilyMember {

    public String getName() {return name;   }
    public String getLastName() {return lastName;   }
    public int getAge() {return age;   }
    public String getStatus() {return status;   }

    private String name;
    private String lastName;
    private int age;
    private String status;

    public FamilyMember(){
        this.name = "mari";
        this.lastName = "sikharulidze";
        this.age = 20;
        this.status = "statusi";
    }

    public void method(){
        try {
            File file = new File("family.txt");
            file.createNewFile();
            String s = getName() + "\n" + getLastName() + "\n" + getAge() + "\n" + getStatus() + "\n";
            Files.write(Paths.get("family.txt"), s.getBytes(), StandardOpenOption.APPEND);

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getMoney(){
        FamilyBudget fb = new FamilyBudget();
        Scanner scan = new Scanner(System.in);
        System.out.print("how much money do you want to take out:");
        int money = scan.nextInt();

        if(money < fb.getMoney()) System.out.println("you can get the money");
        else System.out.println("you dont have enough money");
    }

}







