public class LLExample{
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static boolean isEmpty(){
        return head==null;
    }
    public static void addFirst(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public static void addLast(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public static void removeFirst(){
        if(isEmpty()){
            System.out.println("Emptylist");
            return;
        }
        head=head.next;
    }
    public static void removeLast(){
        if(isEmpty()){
            System.out.println("Empty list");
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public static void printInfo(){
        Node currNode=head;
        if(isEmpty()){
            System.out.println("Empty list");
            return;
        }
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
    }
    public static void reverse(){
        Node prevNode=null;
        Node currNode=head;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head=prevNode;
    }
    
    public static void main(String[] args){
        addFirst(89);
        addFirst(8);
        addFirst(45);
        printInfo();
        System.out.println();
        removeFirst();
        printInfo();
        System.out.println();
        addFirst(45);
        printInfo();
        System.out.println();
        removeLast();
        printInfo();
        System.out.println();
        addLast(89);
        printInfo();
        reverse();
        System.out.println();
        printInfo();

    }
}