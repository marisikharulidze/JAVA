package homework_2.inheritance;

public class B extends A {

    public int x, y;

    public B(){
        x = 15;
        y = 10;
    }
    public int method_B_1(){return y-x;}
    public int method_B_2(){return x+2*y;}

}
