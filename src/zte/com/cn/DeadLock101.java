package zte.com.cn;

public class DeadLock101 {
    public static void main(String[] args) {
        MarkUp markUp0 = new MarkUp("Thread1",0);
        MarkUp markUp1 = new MarkUp("Thread2",1);
        markUp0.start();
        markUp1.start();
        System.out.println("========main end===========");
    }
}

