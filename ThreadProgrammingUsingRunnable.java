//Thread Programming using Runnable Interface


public class ThreadProgrammingUsingRunnable implements Runnable{
    @Override
    public void run(){

        int i=0;
        while(i<10){
            System.out.println(Thread.currentThread().getName() +"Example1");
            i++;
        }
    }

    public static void main(String[] args) {
        ThreadProgrammingUsingRunnable t1=new ThreadProgrammingUsingRunnable();
        ThreadProgrammingUsingRunnable t2=new ThreadProgrammingUsingRunnable();
        Thread thread1=new Thread(t1);
        Thread thread2=new Thread(t2);
        thread1.start();
        thread2.start();

    }
}
