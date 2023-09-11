public class ThreadProgrammingThreeThread {
    private static boolean f2 = false;
    private static boolean f1 = true; // Start with f1 as true
    private static boolean f3 = false;

    public static class Thread1 extends Thread {
        public void run() {
            int i = 0;
            while (i < 5) {
                
                synchronized (ThreadProgrammingThreeThread.class) {
                    while (!f1) {
                        try {
                            ThreadProgrammingThreeThread.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Thread1 ");
                    f1 = false;
                    f2 = true;
                    i++;
                    ThreadProgrammingThreeThread.class.notifyAll();
                }
            }
        }
    }

    public static class Thread2 extends Thread {
        public void run() {
            int i = 0;
            while (i < 5) {
                synchronized (ThreadProgrammingThreeThread.class) {
                    while (!f2) {
                        try {
                            ThreadProgrammingThreeThread.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Thread2 ");
                    f2 = false;
                    f3 = true;
                    i++;
                    ThreadProgrammingThreeThread.class.notifyAll();
                }
            }
        }
    }

    public static class Thread3 extends Thread {
        public void run() {
            int i = 0;
            while (i < 5) {
                synchronized (ThreadProgrammingThreeThread.class) {
                    while (!f3) {
                        try {
                            ThreadProgrammingThreeThread.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Thread3 ");
                    f3 = false;
                    f1 = true;
                    i++;
                    ThreadProgrammingThreeThread.class.notifyAll();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        Thread3 thread3 = new Thread3();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
