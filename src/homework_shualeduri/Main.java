package homework_shualeduri;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.method_1();
        System.out.println(a.method_2());
        System.out.println(a.method_3());
        a.method_4();

        FamilyBudget fb = new FamilyBudget();
        fb.method();
        fb.method_file();

        FamilyMember fm = new FamilyMember();
        fm.method();
        fm.getMoney();


    }
}
