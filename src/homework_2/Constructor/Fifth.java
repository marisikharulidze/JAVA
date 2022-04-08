package homework_2.Constructor;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Fifth fifth = new Fifth(x,y);
        System.out.println(fifth.method_1());
        System.out.println(fifth.method_2());
    }
    public static float x,y;

    public Fifth(){}

    public Fifth(float x,float y){
        Scanner scan = new Scanner(System.in);
        this.x = scan.nextFloat();
        this.y = scan.nextFloat();
    }

    public float method_1(){
        if(y!=0) return x/y+x*y;
        else if(x<=0) return (float)(Math.pow(x,4)+y);
        else return 0;
    }
    public float method_2(){
        if(x>y) return y;
        else return x;
    }
}
