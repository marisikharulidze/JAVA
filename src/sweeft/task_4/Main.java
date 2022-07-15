package sweeft.task_4;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String sequence = "())()";

        System.out.println(isProperly(sequence));
    }

    static Boolean isProperly(String sequence){

        LinkedList list = new LinkedList();

        for (int i = 0; i < sequence.length(); i++) {
            if (list.isEmpty()) {
                list.addFirst(sequence.charAt(i));
            }
            else if (list.getFirst().equals('(') && sequence.charAt(i) == ')') {
                list.removeLast();
            }
        }
        return list.isEmpty();
    }
}
