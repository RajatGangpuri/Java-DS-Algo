//sort array in stack
import java.util.Stack;
public class StackSorting{
    public static void sort(Stack<Integer> stack){
        Stack<Integer> list=new Stack<>();
        while(!stack.isEmpty()){
            int temp=stack.pop();
            while(!list.isEmpty() && list.peek()<temp){
                stack.push(list.pop());
            }
            list.push(temp);
        }
        while(!list.isEmpty()){
            stack.push(list.pop());
        }
    }
    public static void main(String[] args){
        Stack <Integer> stack=new Stack<>();
        stack.push(0);
        stack.push(8);
        stack.push(1);
        stack.push(4);
        stack.push(7);
        stack.push(0);
        System.out.print(stack+" ");
        System.out.println();
        sort(stack);
        System.out.println(stack+" ");
    }
}