// find right greater
// time complexity 0(n) even though there are two loops stack is just implementing one push and pull operation
import java.util.*;
public class StackNextGreaterElement {

    public static void findGreater(int[] array,int[] ans){
        Stack<Integer> stack=new Stack<>();
        for(int i=array.length-1;i>=0;i--){
            while(!stack.isEmpty() && array[stack.peek()]<=array[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=array[stack.peek()];
            }
            stack.push(i);
        }
        for(int i=0;i<array.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] array={6,8,0,1,3};
        int[] ans=new int[array.length];
        findGreater(array,ans);
    }
}
