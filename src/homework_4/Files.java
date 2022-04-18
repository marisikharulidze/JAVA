package homework_4;
import java.io.*;
import java.util.Scanner;
import static java.lang.Math.log;

public class Files {
    public void method_1(){
        try {
            File directory = new File("myFiles");
            File file = new File("myFiles/data.txt");

            if (directory.exists()){ System.out.println("Directory already exists ..."+directory.getName()); }
            else {
                directory.mkdir();
                System.out.printf("Successfully created new directory : %s%n", directory.getName());
            }

            if (file.exists()) {System.out.println("File already exists"+ file.getName());}
            else {
                file.createNewFile();
                System.out.printf("Successfully created new file: %s%n", file.getName());
            }

            FileWriter myWriter = new FileWriter("myFiles/data.txt");
            myWriter.write("24, 39, -90");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

            FileReader rd = new FileReader("myFiles/data.txt");
            int i;
            while ((i = rd.read()) != -1) System.out.print((char)i);
            rd.close();

            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null) System.out.println(st);


        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void method_2(){
        try {
            File file = new File("myFiles/data1.txt");

            if (file.exists()) {System.out.println("File already exists"+ file.getName());}
            else {
                file.createNewFile();
                System.out.printf("Successfully created new file: %s%n", file.getName());
            }

            FileWriter myWriter = new FileWriter("myFiles/data1.txt");
            for (int i=1; i<=100; i++){
//                myWriter.write(String.valueOf(i));
//                myWriter.write(i+"\n");
                myWriter.write(i+"");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void method_4(){
        try {
            for (int i=1; i<=5; i++){
                File file = new File("myFiles/"+i+".txt");
                file.createNewFile();
                FileWriter myWriter = new FileWriter("myFiles/"+i+".txt");
                myWriter.write("Programmer"+i);
                myWriter.close();
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void method_10(){
        int num = 45;
        int binary[] = new int[40];
        int index = 0;
        while(num > 0){
            binary[index++] = num%2;
            num = num/2;
        }
        for(int i = index-1;i >= 0;i--) {
            System.out.print(binary[i]);
        }
    }
    public void method_11(){
        long binaryNumber, decimalNumber = 0, j = 1, remainder;
        binaryNumber = 111;

        while (binaryNumber != 0)
        {
            remainder = binaryNumber % 10;
            decimalNumber = decimalNumber + remainder * j;
            j = j * 2;
            binaryNumber = binaryNumber / 10;
        }
        System.out.println("Decimal Number: " + decimalNumber);
    }
    public void method_12(){
        Scanner scan = new Scanner(System.in);
        System.out.println("input unknown data (p,n,q,k) : ");
        String choose = scan.next();

        double p=100, n=3, k=10, q=150;

        switch(choose) {
            case "p" -> System.out.println("p = "+ q/Math.pow(1+k/100,n));
            case "n" -> System.out.println("n = "+ Math.log(q/p)/Math.log(1+k/100));
            case "q" -> System.out.println("q = "+ p*Math.pow(1+k/100,n));
            case "k" -> System.out.println("k = "+ 100*(Math.pow(q/p,1/n)-1));
        }
    }
    public void method_14() {
        try {
            int a=10, b=20;
            File file = new File("myFiles/numbers.txt");
            file.createNewFile();
            FileWriter myWriter = new FileWriter(file);
            for (int i=a; i<b; i++){
                myWriter.write(i+"\n");
            }
            myWriter.close();

            int odd = 0, even = 0, oddSum=0, evenSum=0;
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null) {
                if (Integer.parseInt(st)%2==0) {even++; evenSum+=Integer.parseInt(st);}
                else {odd++; oddSum+=Integer.parseInt(st);}
//                System.out.println(st);
            }
            System.out.println("odd sum : "+oddSum);
            System.out.println("even sum : "+evenSum);
            System.out.println("odd : "+odd);
            System.out.println("even : "+even);
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void method_15() {


    }

}
