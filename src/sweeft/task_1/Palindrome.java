package sweeft.task_1;

public class Palindrome {

    public boolean isPalindrome(String text){

        String str = "";
        for (int i = text.length()-1; i >= 0; i--) {
            str = str + text.charAt(i);
        }

        if (text.equals(str)) {
            return true;
        }
        else return false;

    }
}
