
public class LinkedListIsCircular {
    public boolean hasCycle(ListNode head) {
        ListNode hare=head;
        ListNode turtle=head;
        if(head==null){
            return false;
        }
        while(turtle.next!=null && turtle.next.next!=null){
            hare=hare.next;
            turtle=turtle.next.next;
            if(hare==turtle){
                return true;
            }
        }
        return false;
    }
}