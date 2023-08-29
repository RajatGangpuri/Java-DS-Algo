import java.util.Stack;

public class StackIsValidString {
    public static boolean isMatching(char ch1,char ch2){
        if(ch1=='(' && ch2==')'){
            return true;
        }
        else{
            return false;
        }
    }
    static int maxLength(String S){
        // code here
        Stack<Character> stack=new Stack<>();
        int count=0;
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
            }
            else{
                if(isMatching(stack.peek(),ch)){
                    count=count+2;
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
        }
        return count;
        
    }
    
    
    public static void main(String[] args){
        String S=")()())";
        System.out.println(maxLength(S));
    }
}
