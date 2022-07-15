import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class practicee {
    /*int len, p,ele;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of an array:");
        len = sc.nextInt();
        int arr[] = new int[len+1];
        System.out.println("Enter "+len+" elements:");
        for(int i = 0; i < len; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element which you want to insert:");
        ele = sc.nextInt();
        arr[len] = ele;
        System.out.print("After inserting : ");
        for(int i = 0; i <len; i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[len]);*///ragaccc important

    //    public void getEvenDigitSum(int number)
//    {
//        int originalNumber = number;
//        int digit, sum = 0;
//
//        while(number != 0)
//        {
//            digit = number % 10;
//
//            if(digit % 2 == 0)
//                sum = sum + digit;
//
//            number = number / 10;
//        }
//        System.out.println("Sum of even digits of number "+originalNumber+ " is: "+sum);
//    }
//
//    public static void main(String args[])
//    {
//        practice eds = new practice();
//
//        eds.getEvenDigitSum(12345);
//        eds.getEvenDigitSum(22222);
//        eds.getEvenDigitSum(13579);
//    }

//    public static void main(String[] args) {
////        Date date = new Date();
////        SimpleDateFormat sdf = new SimpleDateFormat("Y");
////        System.out.println(date);
////        System.out.println(sdf.format(date));
////        int x = Integer.parseInt(sdf.format(date));
////        System.out.println(x);
//        Integer[] list = {2,1,5,8,4,9,6,4,7,5,1,2};
//
//        System.out.println(li(List.of(list),1));
//
//    }
//    static List<Integer> li(List lii, int x){
//
//        for (int i = 0; i < lii.length; i++) {
//            for (int j = i + 1 ; j < lii.length; j++){
//                if (names[i].equals(names[j])) {
//
//                }
//            }
//        }

//        ArrayList arl = new ArrayList();
//        for(int i=0; i<lii.toArray().length; i++){
//            for(int j=i; j<lii.toArray().length; j++){
//                if(lii.get(i) == lii.get(j)){
//                    arl.add(j);
//                }
//
//            }
//        }
//        return arl;
//    }

//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 4, 5, 1));
////        List<String> list = new LinkedList<String>();
////        for (int i = 0; i < 10; i++) {
////            list.add(String.valueOf(i));
////        }
////        for (int i = 0; i < 5; i++) {
////            list.add(String.valueOf(i));
////        }
////        for (int i = 0; i < 2; i++) {
////            list.add(String.valueOf(i));
////        }
//
//        System.out.println("My List : " + list);
//        System.out.println("\nHere are the duplicate elements from list : " + findDuplicates(list));
//    }
//
//    public static Set<String> findDuplicates(List<Integer> listContainingDuplicates) {
//
//        Set<String> setToReturn = new HashSet();
//        Set<String> set1 = new HashSet();
//
//        for (Integer yourInt : listContainingDuplicates) {
//            if (!set1.add(String.valueOf(yourInt))) {
//                setToReturn.add(String.valueOf(yourInt));
//            }
//        }
//        return setToReturn;
//    }
public static String Calculator(String str) {
    // will get all numbers and store it to `numberStr`
    String numberStr[] = str.replaceAll("[+*/()-]+"," ").split(" ");
    // will get all operators and store it to `operatorStr`
    String operatorStr[] = str.replaceAll("[0-9()]+","").split("");

    int total = Integer.parseInt(numberStr[0]);

    for (int i=0; i<operatorStr.length; i++) {
        switch (operatorStr[i]) {
            case "+" :
                total += Integer.parseInt(numberStr[i+1]);
                break;
            case "-" :
                total -= Integer.parseInt(numberStr[i+1]);
                break;
            case "*" :
                total *= Integer.parseInt(numberStr[i+1]);
                break;
            case "/" :
                total /= Integer.parseInt(numberStr[i+1]);
                break;
        }

        if(i+2 >= operatorStr.length) continue; // if meets the last operands already
        numberStr[i+1] = String.valueOf(total);

    }
    return String.valueOf(total);
}
}















