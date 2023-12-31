public class LinkedListStack {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static boolean isEmpty(){
        return head==null;
    }
    public void push(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void pop(){
        if(isEmpty()){
            return;
        }
        head=head.next;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }
    public static void main(String[] args){
        LinkedListStack list=new LinkedListStack();
        list.push(67);
        while(!isEmpty()){
            System.out.println(list.peek());
            list.pop();
        }
    }
}
