public class ThreadProgrammingProducerConsumerProblem {
    private static boolean f2 = false;
    private static boolean f1 = false;

    public static class Thread1 extends Thread {
        public void run() {
            int i = 1;
            while (i < 5) {
                synchronized (ThreadProgrammingProducerConsumerProblem.class) {
                    if (!f1) {
                        System.out.println("Thread1 "+i);
                        f1 = true;
                        f2 = false;
                        i++;
                        ThreadProgrammingProducerConsumerProblem.class.notify();
                    } 
                }
            }
        }
    }

    public static class Thread2 extends Thread {
        public void run() {
            int i = 1;
            while (i < 5) {
                synchronized (ThreadProgrammingProducerConsumerProblem.class) {
                    if (!f2) {
                        System.out.println("Thread2 "+i);
                        f2 = true;
                        f1 = false;
                        i++;
                        ThreadProgrammingProducerConsumerProblem.class.notify();
                    } 
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        
        thread1.start();
        thread2.start();
    }
}
