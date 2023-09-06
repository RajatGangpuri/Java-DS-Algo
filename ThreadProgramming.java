// Thread programming 

class Example extends Thread{
    public void examplemethod1(){
        int i=0;
        while(i<20){
            try {
                Thread.sleep(200,300); // ut thread into sleep
            } catch (Exception e) {
                System.out.println("Exception");
            }
            
            System.out.println("Example1");
            i++;
        }
    }
    
    public void examplemethod2(){
        int i=0;
        while(i<20){
            System.out.println("Example2");
            i++;
        }
    }
}

public class ThreadProgramming {

    public static void main(String[] args) {
        Example ex=new Example();
        ex.examplemethod1();
        ex.examplemethod2();
        ex.start();
        ex.start();
    }
}
