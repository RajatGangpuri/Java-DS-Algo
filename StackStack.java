import java.util.*;
public class StackStack {
    public static void main(String[] args){
        Stack <Integer> list=new Stack<> ();
        list.push(27);
        list.push(67);
        list.push(89);
        System.out.println(list.peek());
        list.pop();
        System.out.println(list.peek());
    }
}
