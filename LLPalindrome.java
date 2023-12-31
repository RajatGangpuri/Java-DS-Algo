
public class LLPalindrome {
    Node head;
    class Node{
        Node next;
        String data;
        Node(String data){
            this.next=null;
            this.data=data;
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
        Node currNode=head;
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("Empty List");
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
            System.out.println("Empty List");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode =head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public void printInfo(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
    }
    public Node find(){
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
        head.next=null;
        head=prevNode;
        return prevNode;
    }
    public boolean palindrome(){
        if(head==null || head.next==null){
            return true;
        }
        Node middle=find();
        Node firstHead=head;
        Node secondHead=reverse(middle.next);
        
        while(secondHead!=null){
            if(firstHead.data!=secondHead.data){
                return false;
            }
            firstHead=firstHead.next;
            secondHead=secondHead.next;
        }
        return true;
        
    }

    public static void main(String[] main){
        LLPalindrome list=new LLPalindrome();
        list.addFirst("Hello1");
        list.addLast("Hello2");
        list.addLast("Hello1");
        list.printInfo();
        System.out.println();
        //list.removeLast();
        //list.printInfo();
        //System.out.println();
        System.out.println(list.palindrome());
        //list.palindrome();
    }
}