import java.util.*;
class Symbol {
    public static boolean isOpening(char c){
        return (c=='{') || (c=='[') || (c=='(');
    }
    public static boolean isMatching(char b,char a){
        return (b=='{' && a=='}') || (b=='[' && a==']') || (b=='(' && a=='}');
    }
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(isOpening(s.charAt(i))){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else if(!isMatching(stack.peek(),s.charAt(i))){
                    System.out.print(stack.peek());
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        String s="[[({])}]";
        System.out.print(isValid(s));
    }
}