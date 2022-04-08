package homework_2.Constructor;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Second sec = new Second(x);
        sec.method_1();
    }

    public static int x;

    public Second(){

    }
    public Second(int x){
        System.out.print("insert : ");
        Scanner scan = new Scanner(System.in);
        this.x = scan.nextInt();
    }
    public void method_1(){
        if(x>=5 && x<=24) System.out.println("shualedshia");
        else System.out.println("ar aris shualedshi");
    }
}
