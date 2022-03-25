package Homework_2.Constructor;

public class First {
    public static void main(String[] args) {
        First first = new First();
        method_1();
    }

    public static int x = 5;

    public First(){
        System.out.println("„hello My Class“");
    }
    public static void method_1(){
        if(x%2 == 0) System.out.println("luwi");
        else System.out.println("kenti");
    }
}
