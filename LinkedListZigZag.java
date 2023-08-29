
// Zig zag of LinkedList


public class LinkedListZigZag {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void addFirst(int data){
        if(head==null){
            Node newNode=new Node(data);
            head=newNode;
            return;
        }
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public static Node findMid(Node head){
        Node fast=head.next;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public static void print(){
        if(head==null){
            System.out.print("Empty List");
        }
        Node currNode =head;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
    }

    public static Node reverse(Node mid){
        Node prevNode=null;
        Node currNode=mid;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        mid.next=null;
        return prevNode;
    }

    public static void zigzag(Node head){
        Node head1=head;
        Node mid=findMid(head);
        Node head2=reverse(mid);
        Node dummy1=head1;
        Node dummy2=head2;
        while(dummy1!=null && dummy2!=null){
            dummy1=head1.next;
            head1.next=head2;
            dummy2=head2.next;
            head2.next=dummy1;
            head1=dummy1;
            head2=dummy2;
        }
    }


    public static void main(String[] args){
        addFirst(1);
        addFirst(2);
        addFirst(3);
        addFirst(4);
        addFirst(8);
        print();
        zigzag(head);
        System.out.println();
        print();


    }
}
