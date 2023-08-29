//Queue implementation using LinkedList
// Time complexity for push,pop and pull is 0(1)
public class QueueLL {
    static Node tail=null;
    static Node head=null;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static boolean isEmpty(){
        return head==null && tail==null;
    }
    public static void push(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static void pop(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        if(head==tail){
            tail=null;
            head=null;
            return;
        }
        head=head.next;
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("List is empty");
            return -1;
        }
        return head.data;
    }
    public static void main(String[] args){
        QueueLL.push(34);
        QueueLL.push(9);
        QueueLL.push(54);
        QueueLL.push(89);
        while(!isEmpty()){
            System.out.println(QueueLL.peek());
            QueueLL.pop();
        }
    }
}
