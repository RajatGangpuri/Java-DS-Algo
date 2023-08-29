//CHocolateproblem
//https://www.geeksforgeeks.org/chocolate-distribution-problem/
import java.util.*;
public class ArrayChocolateProblem{
    public static int find(int[] array, int m){
        Arrays.sort(array);
        int min=Integer.MAX_VALUE;
        int diff=0;
        for(int i=0;i<=array.length-m;i++){
            diff=array[i+m-1]-array[i];
            if(diff<min){
                min=diff;
            }
        }
        return min;
    }
    
    public static void main(String[] args){
        int[] array={12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50} ;
        int m=7;
        System.out.println(find(array,m));
    }
}