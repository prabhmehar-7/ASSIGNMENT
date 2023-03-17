package Question3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Question3 {
    public static void main(String[] args) {
        System.out.println("Q3");
        System.out.println("using newCachedThreadPool()");
        ExecutorService service1 = Executors.newCachedThreadPool();
        for(int i = 0 ; i < 5 ; i++){
            service1.execute(new tsk());
        }
        service1.shutdown();
        System.out.println("using newSingleThreadExecutor()");
        ExecutorService service2 = Executors.newSingleThreadExecutor();
        for(int i = 0 ; i < 5 ; i++){
            service2.execute(new tsk());
        }
        service2.shutdown();
        System.out.println("Using newFixedThreadPool()");
        ExecutorService service3 = Executors.newFixedThreadPool(2);
        for(int i = 0 ; i < 5 ; i++){
            service3.execute(new tsk());
        }
        service3.shutdown();
    }

    static class tsk implements Runnable{
        public void run(){
            try{
                System.out.println(Thread.currentThread().getName() + " is Running");
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }finally {
                System.out.println(Thread.currentThread().getName() + " is Exiting");
            }
        }
    }
}