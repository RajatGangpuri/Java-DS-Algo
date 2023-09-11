public class ABC{
    public static int currentThread=1;


    public static class MyRunnable implements Runnable{
        public int order;
        public int threadId;

        public MyRunnable(int order, int threadId){
            this.threadId=threadId;
            this.order=order;
        }

        @Override
        public void run(){
            int i=1;
            while(i<5){
                synchronized(ABC.class){
                    while(order!=currentThread){
                        try {
                            ABC.class.wait();
                        } catch (Exception e) {
                            // TODO: handle exception
                        }
                    }
                    System.out.println("Thread"+threadId);
                    currentThread=(currentThread%3)+1;
                    i++;
                    ABC.class.notifyAll();
                }
            }
        }
    }



    public static void main(String[] args) {

        Thread thread1=new Thread(new MyRunnable(1,1));
        Thread thread2=new Thread(new MyRunnable(2,2));
        Thread thread3=new Thread(new MyRunnable(3,3));
        thread1.start();
        thread2.start();
        thread3.start();
        
    }
}