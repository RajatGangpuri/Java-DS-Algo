// Double LinkedList Implementation

public class DoublyLLImplementation {
    static Node head;
    static Node tail;
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public static boolean isEmpty(){
        return head==null;
    }

    public static void addFirst(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public static void addLast(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }

    public static void removeFirst(){
        if(isEmpty()){
            System.out.print("Empty list");
            return;
        }
        if(head.next==null){
            head=null;
            tail=null;
            return;
        }
        head=head.next;
        head.prev=null;
    }

    public static void removeLast(){
        if(isEmpty()){
            System.out.print("Empty list");
            return;
        }
        if(head.next==null){
            head=null;
            tail=null;
            return;
        }
        tail=tail.prev;
        tail.next=null;
    }

    public static void print(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
    }
    public static void printReverse(){
        Node currNode=tail;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode=currNode.prev;
        }
    }

    public static void reverse(){
        Node currNode=head;
        Node prevNode=null;
        while(currNode!=null){
            Node nextNode= currNode.next;
            currNode.next=prevNode;
            currNode.prev=nextNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head=prevNode;
    }

    public static void main(String[] args){
        addFirst(3);
        addFirst(87);
        addFirst(85);
        print();
        System.out.println();
        //printReverse();
        //removeLast();
        //System.out.println();
        System.out.println();
        reverse();
        print();

    }
}
