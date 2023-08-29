public class LinkedNode {
    Node head;
    int size;
    LinkedNode(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        Node lastNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        lastNode=head;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
        }
        lastNode.next=newNode;
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        if(head.next==null){
            head=null;
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
    public void printInfo(){
        if(head==null){
            System.out.println("List empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
    }
    public void reverseIterator(){
        if(head==null || head.next==null){
            System.out.println(head);
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    public void find(){
        Node currNode=head;
        while(currNode!=null){
            size=size+1;
            currNode=currNode.next;
        }
        System.out.println(size);
    }
    public Node deleteNum(int num){
        Node currNode=head;
        int size=1;
        while(size<num-1){
            size=size-1;
            currNode=currNode.next;
        }
        currNode.next=currNode.next.next;
        return head;
    }

    public static void main(String[] args){
        LinkedNode list=new LinkedNode();
        list.addFirst("2");
        list.addFirst("1");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.printInfo();
        System.out.println();
        //list.removeFirst();
        //list.removeLast();
        //System.out.println();
        //list.reverseIterator();
        //list.find();
        list.deleteNum(1);
        list.printInfo();

    }
}
