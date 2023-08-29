//Queue using Array
public class QueueArr{
    static int[] array=new int[5];
    static int rear=-1;
    public static boolean isEmpty(){
        return rear==-1;
    }
    public static boolean isFull(){
        return rear==array.length-1;
    }
    public static void push(int data){
        if(isFull()){
            System.out.println("array is full");
            return;
        }
        rear++;
        array[rear]=data;
    }
    public static int pop(){
        if(isEmpty()){
            System.out.println("Empty array");
            return -1;
        }
        int front =array[0];
        for(int i=0;i<rear;i++){
            array[i]=array[i+1];
        }
        rear--;
        return front;
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("Empty array");
            return -1;
        }
        return array[0];  
    }
    public static void main(String[] args){
        QueueArr.push(78);
        QueueArr.push(33);
        QueueArr.push(90);
        QueueArr.push(2);
        while(!isEmpty()){
            System.out.println(QueueArr.peek());
            QueueArr.pop();
        }
    }
}