import java.util.*;

public class StackMaxAreaHistogram{

    public static int findArea(int[] height){
        int max=Integer.MIN_VALUE;
        Stack<Integer> stack=new Stack<>();
        int[] leftmin=new int[height.length];
        int[] rightmin=new int[height.length];
        for(int i=height.length-1;i>=0;i--){
            while(!stack.isEmpty() && height[stack.peek()]>=height[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                rightmin[i]=height.length;
            }
            else{
                rightmin[i]=stack.peek();
            }
            stack.push(i);
        }
        stack=new Stack<>();
        for(int i=0;i<height.length;i++){
            while(!stack.isEmpty() && height[stack.peek()]>=height[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                leftmin[i]=-1;
            }
            else{
                leftmin[i]=stack.peek();
            }
            stack.push(i);
        }

        for(int i=0;i<height.length;i++){
            int width=rightmin[i]-leftmin[i]-1;
            int area=height[i]*width;
            if(max<area){
                max=area;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] height={2,1,5,6,2,3};
        System.out.println(findArea(height));
    }
}