// Reverse Linkedlist

class ReverseLinkedList {
    static ListNode head;
    static class ListNode{
        ListNode next;
        int val;
        ListNode(int val){
            this.next=null;
            this.val=val;
        }
    }
    public static boolean isEmpty(){
        return head==null;
    }
    public static void addFirst(int val){
        ListNode newNode=new ListNode(val);
        if(isEmpty()){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public ListNode reverseList() {
        ListNode currNode=head;
        ListNode prevNode=null;
        while(currNode!=null){
            ListNode nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
        return head;
    }
    public static void printInfo(){
        ListNode currNode=head;
        while(currNode!=null){
            System.out.print(currNode.val+" ");
            currNode=currNode.next;
        }
    }
    public static void main(String[] args){
        addFirst(1);
        addFirst(2);
        addFirst(3);
        addFirst(4);
        addFirst(5);
        printInfo();
        ReverseLinkedList myobj=new ReverseLinkedList();
        myobj.reverseList();
        System.out.println();
        printInfo();
    }
}