// reverse string using stack
import java.util.*;
public class StackReverseString {
    public static void find(Stack<Character>stack,String str){
        int i=0;
        while(i<str.length()){
            stack.push(str.charAt(i));
            i++;
        }
    }


    public static void main(String[] args){
        Stack<Character> stack=new Stack<>();
        String str="rajat";
        find(stack,str);
        while(!stack.isEmpty()){
            System.out.print(stack.peek()+" ");
            stack.pop();
        }
    }
}
