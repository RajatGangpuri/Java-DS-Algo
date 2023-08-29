public class QueueCircularArray{
    static int[] array=new int[5];
    static int rear=-1;
    static int front =-1;
    static int size=array.length;
    public static boolean isEmpty(){
        return front==-1 && rear==-1;
    }
    public static boolean isFull(){
        return (rear+1)%size==front;
    }
    public static void push(int data){
        if(isFull()){
            System.out.println("Full List");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%size;
        array[rear]=data;
    }
    public static void pop(){
        if(isEmpty()){
            System.out.println("Empty List");
            return;
        }
        if(rear==front){
            rear=front=-1;
            return;
        }
        front=(front+1)%size;
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("Empty List");
            return -1;
        }
        return array[front];
    }


    public static void main(String[] args){
        QueueCircularArray.push(87);
        QueueCircularArray.push(90);
        QueueCircularArray.push(45);
        QueueCircularArray.push(32);
        while(!isEmpty()){
            System.out.println(QueueCircularArray.peek());
            QueueCircularArray.pop();
        }
    }
}