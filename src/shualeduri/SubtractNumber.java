package shualeduri;

import java.util.concurrent.ThreadLocalRandom;

public class SubtractNumber extends Thread{

    public static void main(String[] args) {
        SubtractNumber sn = new SubtractNumber();
        sn.method();
        Thread thread = new Thread(sn);
        thread.run();

        SubtractNumber sn1 = new SubtractNumber();
        Thread thread1 = new Thread(sn1);
        thread1.run();
    }

    public PrimaryNumber pn;

    SubtractNumber(){
        this.pn = new PrimaryNumber();
    }

    void method(){
        if(pn.getNumber()>=60){
            int y = ThreadLocalRandom.current().nextInt(50, 60);
            int x = pn.getNumber()-y;
            pn.setNumber(x);
        }
    }

    public void run() {
        for(int i=0; i<5; i++) method();
    }
}
