package homework_2.inheritance;

public class C extends B{

    public double z = 10;

    public int method_C_1(){
        return (int) ((x+y+z)/3);
    }
    public int method_C_2(){
        return (int) Math.sqrt((x*y*z));
    }
}
