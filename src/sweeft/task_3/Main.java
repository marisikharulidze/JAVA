package sweeft.task_3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] array = {8, -3, 2, 6, -1, 1, 3};

        System.out.println(notContains(array));
    }

    static int notContains(int[] array){

        int smallest = Integer.MAX_VALUE;
        for(int ar : array){
            if(ar > 0 && ar < smallest) {
                smallest = ar;
            }
        }

        int finalSmallest = smallest;
//        for(int i=0; i<=Arrays.stream(array).max().getAsInt(); i++){
//            if(IntStream.of(array).anyMatch(k -> k == finalSmallest)){
//                smallest++;
//            }
//            else {
//                System.out.println(smallest);
//            }
//        }

        return smallest;
    }
}
