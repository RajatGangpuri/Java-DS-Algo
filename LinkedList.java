public class LinkedList{
    static Node head;
    static class Node{
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
    public void printInfo(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("Empty list cant remove node");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        head=head.next;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("Empty list cant remove node");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            secondLast=secondLast.next;
            lastNode=lastNode.next;
        }
        secondLast.next=null;
    }
    public int findLength(){
        int size=0;
        Node currNode=head;
        while(currNode!=null){
            currNode=currNode.next;
            size=size+1;
        }
        return size;
    }
    public static void reverseIterator(){
        if(head==null || head.next==null){
            System.out.println(head);
            return;
        }
        Node prevNode =head;
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
    public void findN(int num){
        if(head==null){
            System.out.println(head);
            return;
        }
        Node currNode=head;
        int i=1;
        while(i<num){
            currNode=currNode.next;
            i++;
        }
        System.out.println(currNode.data);
    }
    public void findLastN(int num){
        if(head==null){
            System.out.println(head);
            return;
        }
        Node currNode=head;
        int size=findLength();
        int i=1;
        while(i<size-num+1){
            currNode=currNode.next;
            i++;
        }
        System.out.println(currNode.data);
    }
    public void findNdDelete(int num){
        if(head==null){
            System.out.println(head);
            return;
        }
        Node currNode=head;
        Node removeNode=head.next.next;
        int size=findLength();
        int i=1;
        while(i<size-num){
            currNode=currNode.next;
            removeNode=removeNode.next;
            i++;
        }
        currNode.next=currNode.next.next;
    }
    public Node findValue(Node head){
        Node hare=head;
        Node turtle=head;
        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }
    public Node reverse(Node head){
        Node prevNode=null;
        Node currNode=head;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        return prevNode;
    }
    public boolean palendrome(Node head){
        Node middle=findValue(head);
        Node secondHead=reverse(middle.next);
        Node firstHead=head;
        while(secondHead!=null){
            if(firstHead.data!=secondHead.data){
                return false;
            }
            firstHead=firstHead.next;
            secondHead=secondHead.next;
        }
        return true;
    }

    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.addFirst("h");
        list.addFirst("I");
        list.addFirst("a");
        list.addLast("hy");
        list.addLast("I");
        list.addLast("am");
        list.printInfo();
        System.out.println();
        reverseIterator();
        System.out.println();
        list.printInfo();
        //list.removeFirst();
        //list.printInfo();
        //System.out.println();
        //list.addLast("Gangpuri");
        //list.printInfo();
        //list.removeLast();
        //System.out.println();
        //list.printInfo();
        //System.out.println(list.findLength());
        //System.out.println();
        //list.reverseIterator();
        //list.printInfo();
        //list.findN(5);
        //list.findLastN(5);
        //list.findNdDelete(5);
        //list.palendrome(head);
    }
}