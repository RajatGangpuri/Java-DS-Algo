// Merge Sort of LinkedList


public class LinkedListMergeSort {
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

    public static Node merge(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node mid=findMid(head);
        Node head2=mid.next;
        mid.next=null;
        Node newleft=merge(head);
        Node newright=merge(head2);
        //merge sort
        return mergeSort(newleft,newright);
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


    public static Node mergeSort(Node head1,Node head2){
        Node newNode=new Node(-1);
        Node dummy=newNode;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                dummy.next=head1;
                head1=head1.next;
            }
            else{
                dummy.next=head2;
                head2=head2.next;
            }
            dummy=dummy.next;
        }
        while(head1!=null){
            dummy.next=head1;
            head1=head1.next;
            dummy=dummy.next;
        }
        while(head2!=null){
            dummy.next=head2;
            head2=head2.next;
            dummy=dummy.next;
        }
        return newNode.next;
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


    public static void main(String[] args){
        addFirst(1);
        addFirst(2);
        addFirst(3);
        addFirst(4);
        print();

        Node sortList=merge(head);
        while(sortList!=null){
            System.out.print(sortList.data+" ");
            sortList=sortList.next;
        }
    }
}
