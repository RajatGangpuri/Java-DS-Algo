import java.util.*;
public class StackValidParenthesis {
    public static boolean findParenthesis(String str){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(isOpening(str.charAt(i))){
                stack.push(str.charAt(i));
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if(!isMatching(stack.pop(),str.charAt(i))){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static boolean isOpening(char ch){
        if(ch=='(' || ch=='{' || ch=='['){
            return true;
        }
        return false;
    }
    public static boolean isMatching(char ch1, char ch2){
        if(ch1=='(' && ch2==')'){
            return true;
        }
        if(ch1=='{' && ch2=='}'){
            return true;
        }
        if(ch1=='[' && ch2==']'){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        String str="(){][]";
        System.out.print(findParenthesis(str));
    }
}
