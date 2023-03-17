package Question4;

public class Question4 {

    public static void main(String args[]){

        String lock1 = "Mehar" ;
        String lock2 = "TTN" ;

        Thread thread1 = new Thread(()->{
            synchronized (lock1){
                try{
                    Thread.sleep(1);
                }catch(InterruptedException e){
                    e.printStackTrace() ;
                }
                synchronized(lock2){
                    System.out.println("Lock Aquired");
                }
            }
        } , "thread1") ;

        Thread thread2 = new Thread(() -> {
            synchronized (lock2){
                try{
                    Thread.sleep(1);
                }catch(InterruptedException e){
                    e.printStackTrace() ;
                }
                synchronized(lock1){
                    System.out.println("Lock Aquired");
                }
            }
        } , "thread2") ;

        thread1.start() ;
        thread2.start() ;

        System.out.println("main is being executed");

    }

}
