import java.util.*;
public class StackStockSpan {
    public static void findSpan(int[] stocks,int[] span){
        Stack<Integer> stack=new Stack<>();
        span[0]=1;
        stack.push(stocks[0]);
        for(int i=1;i<span.length;i++){
            while(!stack.isEmpty() && stocks[i]>stocks[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                span[i]=i+1;
            }
            else{
                span[i]=i-stack.peek();
            }
        }
    }
    public static void main(String[] args){
        int[] stocks={100,80,60,70,60,85,100};
        int[] span=new int[stocks.length];
        findSpan(stocks,span);

    }
}
