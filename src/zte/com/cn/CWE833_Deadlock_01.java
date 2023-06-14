package zte.com.cn;

public class CWE833_Deadlock_01 {
    public synchronized void helperBowBad(CWE833_Deadlock_01 bower){
        System.out.println("=====helpBowBad========");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException ie){
            System.out.println(ie);
        }
        bower.helpBowBackBad(this);
    }
    public synchronized  void helpBowBackBad(CWE833_Deadlock_01 bower){
        System.out.println("=====helpBowBackBad========");
    }
}
