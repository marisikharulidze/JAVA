package homework_2.Constructor;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Sixth sixth = new Sixth(x,y);
    }
    public static float x, y;

    public static Scanner scan = new Scanner(System.in);

    public Sixth(){}

    public Sixth(float x){
        this.x = scan.nextFloat();
//        System.out.println("x :"+this.x);
    }

    public Sixth(float x,float y){
        Sixth sixth = new Sixth(this.x);
        this.y = scan.nextFloat();
//        System.out.println("y :"+this.y);
    }
//    public float method_1(){
//
//    }
}
