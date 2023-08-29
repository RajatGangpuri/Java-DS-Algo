
//Find minimum number of merge operations to make an array palindrome

import java.util.*;
public class ArrayMinimumPalindrome {
    public static int find(int N, int arr[]){
        int i=0;
        int j=N-1;
        int count=0;
        while(i<j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            else if(arr[i]<arr[j]){
                i++;
                arr[i]=arr[i]+arr[i-1];
                count++;
            }
            else{
                j--;
                arr[j]=arr[j]+arr[j+1];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr={11, 14, 15, 99};
        int N=4;
        System.out.println(find(N,arr));
        
    }
        
}