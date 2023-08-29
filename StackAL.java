//Stack implementation using ArrayList
//Time Complexity push 0(1),pop 0(1), peek 0(1)
import java.util.*;
public class StackAL {
    static ArrayList<Integer> list =new ArrayList<>();
    public static boolean isEmpty(){
        return list.size()==0;
    }
    public static void push(int data){
        list.add(data);
    }
    public static void pop(){
        if(isEmpty()){
            System.out.println("List is empty");
        }
        list.remove(list.size()-1);
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("List is empty");
            return -1;
        }
        return list.get(list.size()-1);
    }
    public static void main(String[] args){
        StackAL.push(89);
        StackAL.push(76);
        StackAL.push(43);
        StackAL.push(23);
        while(!isEmpty()){
            System.out.println(StackAL.peek());
            StackAL.pop();
        }
    }
}
