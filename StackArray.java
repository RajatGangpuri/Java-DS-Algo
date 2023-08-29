import java.util.*;

public class StackArray {
    public static void pushAtBottom(Stack<Integer> stack, int data) {
        while(stack.size()!=0){
            int top=stack.pop();
            stack.push(top);
        }
        stack.push(data);
    }

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        pushAtBottom(stack, 4);
    }
}
