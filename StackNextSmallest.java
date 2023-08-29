// find right smallest
// time complexity 0(n) even though there are two loops stack is just implementing one push and pull operation

import java.util.*;
public class StackNextSmallest {

    public static void findSmall(int[] array,int[] small){
        Stack<Integer> stack=new Stack<>();
        for(int i=array.length-1;i>=0;i--){
            while(!stack.isEmpty() && array[stack.peek()]>=array[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                small[i]=-1;
            }
            else{
                small[i]=array[stack.peek()];
            }
            stack.push(i);
        }
        for(int i=0;i<array.length;i++){
            System.out.print(small[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] array={6,8,1,0,3};
        int[] small=new int[array.length];
        findSmall(array,small);
    }
}
