package finall.task_1;

import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class One implements IOne {

    LinkedList list = new LinkedList();

    String[] arr = new String[20];

    @Override
    public void method1() {
        String alphabet = "abcdefghijklmnopqrstweyxz";
        int wordsNum = 20;
        int charsNum = 7;
        String result = "";

        for(int i=0; i<wordsNum; i++){
            for(int j=0; j<charsNum; j++){
                int rand = ThreadLocalRandom.current().nextInt(0,charsNum+1);
                arr[i] += String.valueOf(alphabet.charAt(rand));
            }

        }
        for(int i=0; i<wordsNum; i++){
            System.out.println(arr[i]);
        }

//        for(int i=0; i<wordsNum; i++){
//            for(int j=0; j<charsNum; j++){
//                int rand = ThreadLocalRandom.current().nextInt(0,charsNum+1);
//                if(result.length()<8){
//                    result += String.valueOf(alphabet.charAt(rand));
//                }
//                else {
//                    result += "";
//                }
//            }
//            list.add(result);
//        }
//
//        System.out.println(list);
    }

    @Override
    public void method2() {

    }
}