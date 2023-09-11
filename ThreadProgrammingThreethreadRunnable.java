public class ThreadProgrammingThreethreadRunnable {
    private static final Object lock = new Object();
    private static int currentThread = 1;

    public static class MyRunnable implements Runnable {
        private final int threadId;
        private final int order;

        public MyRunnable(int threadId, int order) {
            this.threadId = threadId;
            this.order = order;
        }

        @Override
        public void run() {
            int count = 5; // Number of times each thread should run

            while (count > 0) {
                synchronized (lock) {
                    while (order != currentThread) {
                        try {
                            lock.wait();
                        } catch (Exception e) {
                            
                        }
                    }

                    System.out.println("Thread " + threadId);

                    currentThread = (currentThread % 3) + 1;
                    count--;

                    lock.notifyAll();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(1, 1));
        Thread thread2 = new Thread(new MyRunnable(2, 2));
        Thread thread3 = new Thread(new MyRunnable(3, 3));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
