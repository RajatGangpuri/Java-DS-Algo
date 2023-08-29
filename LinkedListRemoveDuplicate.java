
class LinkedListRemoveDuplicate
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
         if(head==null || head.next==null){
             return head;
         }
         HashSet<Integer> hash=new HashSet<>();
         Node currNode=head;
         Node prevNode=null;
         while(currNode!=null){
             if(hash.contains(currNode.data)){
                 prevNode.next=currNode.next;
             }
             else{
                 hash.add(currNode.data);
                 prevNode=currNode;
             }
             currNode=currNode.next;
         }
         return head;
    }
}