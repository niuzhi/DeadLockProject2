package zte.com.cn;

import java.util.concurrent.locks.ReentrantLock;

public class TestDeadLock {
     private int intBadNumber1 = 3;
     private final ReentrantLock BAD_NUMBER1_REENTRANTLOCK = new ReentrantLock();

     private int intBadNumber2 = 5;
     private final ReentrantLock BAD_NUMBER2_REENTRANTLOCK = new ReentrantLock();

     public void helperAddBad(){
        BAD_NUMBER1_REENTRANTLOCK.lock();
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        BAD_NUMBER2_REENTRANTLOCK.lock();
        try {
            intBadNumber1 = intBadNumber1 + intBadNumber2;
        }finally {
            BAD_NUMBER2_REENTRANTLOCK.unlock();
            BAD_NUMBER1_REENTRANTLOCK.unlock();
        }
    }

     public void helperMultiplyBad()
    {
        /* FLAW: obtain locks in the opposite order as in helperAddBad() */
        BAD_NUMBER2_REENTRANTLOCK.lock();

        try
        {
            Thread.sleep(1000); /* sleep for a bit to allow a context switch or the other thread to "catch up" */
        }
        catch (InterruptedException exceptInterrupted)
        {
            System.out.println(exceptInterrupted);
        }

        BAD_NUMBER1_REENTRANTLOCK.lock();

        try
        {
            intBadNumber1 = intBadNumber1 * intBadNumber2;
        }
        finally
        {
            BAD_NUMBER1_REENTRANTLOCK.unlock();
            BAD_NUMBER2_REENTRANTLOCK.unlock();
        }
    }
}
