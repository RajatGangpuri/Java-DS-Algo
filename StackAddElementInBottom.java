import java.util.*;
public class StackAddElementInBottom {
    public static void find(Stack<Integer>stack,int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int temp=stack.pop();
        find(stack,data);
        stack.push(temp);
    }


    public static void main(String[] args){
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(78);
        stack.push(54);
        stack.push(94);
        find(stack,4);
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
