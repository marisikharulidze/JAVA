import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class java_1 {
    public static void main(String[] args) {
        _1();
        _2();
        _3();
        _4();
        _5();
        _6();
        _7();
        _8();
        _9();
        _10();
        _11();
        _12();
    }

    public static Scanner scan = new Scanner(System.in);

    public static void _1() {
        System.out.println("...N1"+"\n"+"C++"+"\n"+"C#"+"\n"+"Java"+"\n"+"Parcial"+"\n"+"Php"+"\n"+"JavaScript");
    }
    public static void _2() {
        System.out.println("...N2");
        System.out.print("insert : ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println("x/y="+x/y);
        System.out.println("y%x="+y%x);
    }
    public static void _3() {
        System.out.println("...N3");
        System.out.print("insert : ");
        int x,y,z,sum ,mult;
        x = scan.nextInt();
        y = scan.nextInt();
        z = scan.nextInt();
        sum = x+y+z;
        mult = x*y*z;
        System.out.println("sum : "+(x+y+z));
        System.out.println("mult : "+mult);
    }
    public static void _4() {
        System.out.println("...N4");
        System.out.print("insert : ");
        int x = scan.nextInt();
        String strx = String.valueOf(x);
        if(strx.length() != 3) System.out.println("number should contain 3 digits");
        else{
            System.out.println(x/100);
            System.out.println(x%100/10);
            System.out.println(x%10);
        }
    }
    public static void _5(){
        System.out.println("...N5");
        System.out.print("insert : ");
        int x = scan.nextInt();
        String strx = String.valueOf(x);
        if(strx.length() != 4 ) System.out.println("number should contain 4 digits");
        else{
//            System.out.println(x/1000);
//            System.out.println(x%1000/100);
//            System.out.println(x%100/10);
//            System.out.println(x%10);
            System.out.println(x/1000+x%1000/100+x%100/10+x%10);
        }
    }
    public static void _6(){
        System.out.println("...N6");
        int x, newx, sum = 0;
        System.out.print("insert : ");
        x = scan.nextInt();
        while(x > 0) {
            newx = x % 10;
            sum = sum + newx;
            x = x / 10;
        }
        System.out.println("Sum of Digits:"+sum);
    }
    public static void _7(){
        System.out.println("...N7");
        int x,y,newx,newy;
        System.out.print("insert : ");
        x = scan.nextInt();
        y = scan.nextInt();
        newx = x;
        newy = y;
        while(x != y){
            if(x>y) x -= y;
            else y -= x;
        }
        System.out.println("GCD : "+x);
        System.out.println("LCM : "+((newx*newy)/x));
    }
    public static void _8(){
        System.out.println("...N8");
        System.out.print("insert : ");
        int i, m, n;
        m = scan.nextInt();
        n = scan.nextInt();
        for(i=m; i<n; i++){
            System.out.println(i);
        }
    }
    public static void _9(){
        System.out.println("...N9");
        int[] arr = {1,2,3,4,5,6,7,8};
        for(int element : arr){
            System.out.println(element);
        }
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
    public static void _10(){
        System.out.println("...N10");
        int[] arr = {1,2,3,8,7,6,5,4};
        Arrays.sort(arr);
        for(int element : arr){
            System.out.println(element);
        }
    }
    public static void _11(){
        System.out.println("...N11");
        int[] arr = new int[8];
        int min = 0;
        int max = 10;
        for(int i=0; i<8; i++){
            int x = ThreadLocalRandom.current().nextInt(min, max + 1);
            arr[i] = x;
        }
        System.out.print("[");
        for(int element : arr){
            System.out.print(element+" ");
        }
        System.out.print("]");
    }
    public static void _12(){
        System.out.println("...N12");
        Integer[] arr = new Integer[8];
        int min = 0;
        int max = 10;
        for(int i=0; i<8; i++){
            int x = ThreadLocalRandom.current().nextInt(min, max + 1);
            arr[i] = x;
        }
        Arrays.sort(arr, Collections.reverseOrder());
//        Arrays.toString(arr);
        System.out.print("[");
        for(int element : arr){
            System.out.print(element+" ");
        }
        System.out.print("]");
    }
}
