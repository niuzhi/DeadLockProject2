package zte.com.cn;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeadLock105 {

    private static final long serialVersionUID = 1L;
    /* Bad - Call to a synchronized method on another object while holding lock on this object */

    /* Create bad static objects */
    static CWE833_Deadlock_01 objectBadFirst = new CWE833_Deadlock_01();
    static CWE833_Deadlock_01 objectBadSecond = new CWE833_Deadlock_01();

    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                objectBadFirst.helperBowBad(objectBadSecond);
            }
        });
        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                objectBadSecond.helperBowBad(objectBadFirst);
            }
        });
        threadOne.start();
        threadTwo.start();
        threadOne.join();
        threadTwo.join();
    }

}
