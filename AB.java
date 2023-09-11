

public class AB{

    private static Object lock=new Object();
    private static int currentThread=1;

    public static class MyRunnable implements Runnable{
        public int threadId;
        public int order;
        public MyRunnable(int threadId, int order){
            this.threadId=threadId;
            this.order=order;
        }

        @Override
        public void run(){
            int count=5;
            while(count>0){
                synchronized(lock){
                    while(order!=currentThread){
                        try {
                            lock.wait();
                        } catch (Exception e) {

                        }
                    }
                    System.out.println("Thread"+ threadId);
                    currentThread=(currentThread%4) +1;
                    count--;
                    lock.notifyAll();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1=new Thread(new MyRunnable(1, 1));
        Thread thread2=new Thread(new MyRunnable(2, 2));
        Thread thread3=new Thread(new MyRunnable(3, 3));
        Thread thread4=new Thread(new MyRunnable(4, 4));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}