
// Minimum Sum of Absolute difference of pairs

import java.util.*;
public class GreedyMinimumSumAbsolutePairs{
    public static void check(int[] A,int[] B){
        Arrays.sort(A);
        Arrays.sort(B);
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum=sum+Math.abs(A[i]-B[i]);
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        int[] A={4,1,8,7};
        int[] B=  {2,3,6,5};
        check(A,B);
    }
}