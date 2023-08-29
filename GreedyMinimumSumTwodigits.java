

// Minimum sum two numbers formed digits array-2
import java.util.*;

class GreedyMinimumSumTwodigits {
    
    public static long minSum(int arr[], int n)
    {
        Arrays.sort(arr);
        long a=0;
        long b=0;
        int i=0;
        while(i<n){
            a=a*10+arr[i];
            i++;
            if(i<n){
                b=b*10+arr[i];
                i++;
            }
        }
        return a+b;
    }
    public static void main(String[] args){
        int[] array={6, 8, 4, 5, 2, 3};
        int n=3;
        System.out.print(minSum(array,n));
    }
}