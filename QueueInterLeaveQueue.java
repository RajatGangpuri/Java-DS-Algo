
import java.util.*;
import java.util.LinkedList;
public class QueueInterLeaveQueue{
    public static void InterLeave(Queue<Integer> q1){
        Queue<Integer> q=new LinkedList<>();
        int mid=q1.size()/2;
        for(int i=0;i<mid;i++){
            q.add(q1.remove());
        }
        while(!q.isEmpty()){
            q1.add(q.remove());
            q1.add(q1.remove());
        }
        while(!q1.isEmpty()){
            System.out.print(q1.peek()+" ");
            q1.remove();
        }
    }

    public static void main(String[] args){
        Queue<Integer> q1=new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.add(7);
        q1.add(8);
        q1.add(9);
        q1.add(10);
        InterLeave(q1);
    }
}