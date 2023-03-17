package Question2;

import java.util.concurrent.locks.ReentrantLock;
public class Question2 {

    public static ReentrantLock reentrantLock1  = new ReentrantLock() ;
    public static ReentrantLock reentrantLock2  = new ReentrantLock() ;

    public static void main(String[] args) {
        final String res2 = "Him";
        Thread t1 = new Thread() {
            public void run() {
                reentrantLock1.lock();
                System.out.println("Thread 1: locked resource 1");
                try { Thread.sleep(100);} catch (Exception e) {}
                reentrantLock2.lock();
                System.out.println("Thread 1: locked resource 2");
                reentrantLock2.unlock();
                reentrantLock1.unlock();
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                reentrantLock1.lock();
                System.out.println("Thread 2: locked resource 2");
                try { Thread.sleep(100);} catch (Exception e) {}
                reentrantLock2.lock();
                System.out.println("Thread 2: locked resource 1");
                reentrantLock2.unlock();
                reentrantLock1.unlock();
            }
        };
        t1.start();
        t2.start();
    }
}