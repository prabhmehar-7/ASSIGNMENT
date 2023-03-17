package Question1;

public class ThreadClass extends Thread{

    @Override
    public void run(){
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("Thread : " + Thread.currentThread().getName() + "is running ");
            try{
                Thread.sleep(1) ;
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread() ;
        thread1.start();
        System.out.println("this is main");
        thread1.join();
        System.out.println("this is main too");
    }

}
