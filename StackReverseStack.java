
// reverse string using stack
import java.util.*;
public class StackReverseStack {
    public static void find(Stack<Integer>stack){
        if(stack.isEmpty()){
            return;
        }
        int temp=stack.pop();
        find(stack);
        pushAtBottom(stack,temp);
    }

    public static void printStack(Stack<Integer> stack){
        while(!stack.isEmpty()){
            System.out.print(stack.peek()+" ");
            stack.pop();
        }
    }

    public static void pushAtBottom(Stack<Integer> stack,int value){
        if(stack.isEmpty()){
            stack.push(value);
            return;
        }
        int temp=stack.pop();
        pushAtBottom(stack,value);
        stack.push(temp);
    }

    public static void main(String[] args){
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        find(stack);
        printStack(stack);
        
    }
}
