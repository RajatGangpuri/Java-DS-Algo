public class LinkedListFullCode{
    static Node head;
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.next=null;
            this.data=data;
        }
    }
    public static boolean isEmpty(){
        return head==null;
    }
    public static void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
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
            System.out.println("Empty list");
            return;
        }
        if(head.next==null){
            head=null;
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
    public static void size(){
        Node currNode=head;
        if(isEmpty()){
            System.out.println("Empty list");
            return;
        }
        int size=0;
        while(currNode!=null){
            size=size+1;
            currNode=currNode.next;
        }
        System.out.println(size);
    }
    public static Node reverseMid(Node head){
        Node prevNode=null;
        Node currNode=head;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
        return head;
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
        head.next=null;
        head=prevNode;
    }

    public static boolean search(int value){
        if(isEmpty()){
            return false;
        }
        Node currNode=head;
        while(currNode!=null){
            if(currNode.data==value){
                return true;
            }
            currNode=currNode.next;
        }
        return false;
    }
    public static boolean palindrome(){
        Node middle=mid();
        Node currNode=head;
        Node secondHead=reverseMid(middle.next);
        while(secondHead!=null){
            if(currNode.data!=secondHead.data){
                return false;
            }
            secondHead=secondHead.next;
            currNode=currNode.next;
        }
        return true;
    }
    public static Node mid(){
        if(isEmpty()){
            return null;
        }
        Node hare=head;
        Node turtle=head;
        while(hare!=null && hare.next!=null){
            turtle=turtle.next;
            hare=hare.next.next;
        }
        return turtle;
    }


    public static void seggregate(){
        Node currNode =head;
        Node newNode1=new Node(0);
        Node newNode2=new Node(1);
        Node even=newNode1;
        Node odd=newNode2;
        while(currNode!=null){
            if(currNode.data%2==0){
                even.next=currNode;
                even=even.next;
            }
            else{
                odd.next=currNode;
                odd=odd.next;
            }
            currNode=currNode.next;
        }
        even.next=newNode2.next;
        head=newNode1.next;
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
    public static void main(String[] args){
        addFirst(17);
        addFirst(15);
        addFirst(8);
        addFirst(12);
        addFirst(10);
        addFirst(5);
        addFirst(4);
        addFirst(1);
        addFirst(7);
        addLast(6);
        printInfo();
        System.out.println();
        seggregate();
        printInfo();
        System.out.println();
        //removeFirst();
        //printInfo();
        //System.out.println();
        //removeLast();
        //printInfo();
        //System.out.println();
        //reverse();
        //printInfo();
        //System.out.println();
        //System.out.print("size=");
        //size();
        //System.out.println(palindrome());
        //System.out.println(search(6));
    }
}