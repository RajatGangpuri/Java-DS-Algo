// Queue using two stacks
import java.util.*;
public class QueueUsingTwoStacks{

    static class Q{
        static Stack<Integer> stack1=new Stack<>();
        static Stack<Integer> stack2=new Stack<>();
        public static boolean isEmpty(){
            return stack1.isEmpty();
        }
        public static void push(int data){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            stack1.push(data);
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }

        public static void pop(){
            if(Q.isEmpty()){
                System.out.print("empty queue");
                return;
            }
            System.out.println(stack1.pop());
        }
        public static void peek(){
            if(Q.isEmpty()){
                System.out.print("empty queue");
                return;
            }
            System.out.println(stack1.peek());
        }
        
    }

    public static void main(String[] args){
        Q.push(89);
        Q.peek();
    }
}