package homework_2.inheritance;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.method_1();
        a.method_2();
        a.method_3();

        B b = new B();
        System.out.println(b.method_B_1());
        System.out.println(b.method_B_2());

        C c = new C();
        System.out.println(c.method_C_1());
        System.out.println(c.method_C_2());

    }
}
