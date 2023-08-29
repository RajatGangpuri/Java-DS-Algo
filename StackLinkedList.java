// Stack implementation using LinkedList
// Time complexity push 0(1), pop 0(1), peek 0(1)
public class StackLinkedList {
    static Node head;
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static boolean isEmpty(){
        return head==null;
    }
    public static void push(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public static void pop(){
        if(isEmpty()){
            System.out.println("Empty list");
            return;
        }
        head=head.next;
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("Empty list");
            return -1;
        }
        return head.data;
    }
    public static void main(String[] args){
        StackLinkedList.push(78);
        StackLinkedList.push(90);
        StackLinkedList.push(54);
        StackLinkedList.push(23);
        while(!isEmpty()){
            System.out.println(StackLinkedList.peek());
            StackLinkedList.pop();
        }
    }
}
