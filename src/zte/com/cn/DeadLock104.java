package zte.com.cn;

import java.util.concurrent.locks.ReentrantLock;

public class DeadLock104 {

    public static void main(String[] args) throws InterruptedException {
        TestDeadLock td = new TestDeadLock();
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                td.helperAddBad();
            }
        });
        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                td.helperMultiplyBad();
            }
        });
        threadOne.start();
        threadTwo.start();
        threadOne.join();
        threadTwo.join();
        System.out.println("=========end ===============");
    }

}
