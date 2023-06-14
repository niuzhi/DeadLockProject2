package zte.com.cn;

import java.util.concurrent.TimeUnit;

public class MarkUp  extends Thread{
    private int choice;
    private String userName;

    private static LipStick lipStick = new LipStick();
    private static Mirror mirror = new Mirror();

    MarkUp(String userName, int choice) {
        this.userName = userName;
        this.choice = choice;
    }

    @Override
    public void run() {
        try {
            markUP();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void markUP() throws InterruptedException {
        if (choice == 0) {
            synchronized (lipStick) {
                System.out.println(userName + "lipStick");
                TimeUnit.SECONDS.sleep(1);
                // 程序执行此处会停止 		 -----------------这里死锁----------------------->
                synchronized (mirror) {
                    System.out.println(userName + "mirror");
                }
            }
        }
        if (choice == 1) {
            synchronized (mirror) {
                System.out.println(userName + "mirror");
                TimeUnit.SECONDS.sleep(1);
                // 程序执行此处会停止          -----------------这里死锁----------------------->
                synchronized (lipStick) {
                    System.out.println(userName + "lipStick");
                }
            }
        }
    }
}
