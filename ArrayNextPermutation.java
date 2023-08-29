
//next permutation
//step1 - Index1 = find arr[i]>arr[i-1]; traversal from right corner
//step2 - Index2= arr[i]>arr[Index1]; traversal from right corner
//step 3 - reverse arr[Index1]=arr[Index2];
//step 4 - reverse whole array after index 1
// step5 - else condition if there is no index1 then reverse whole array and revert as ans

import java.util.*;
public class ArrayNextPermutation {
    public static void nextPermutation(int N, int arr[]){
        // code here
        ArrayList<Integer> array=new ArrayList<>();
        int index1=N-1;
        int index2=N-1;
        for(int i=N-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                index1=i-1;
                break;
            }
        }
        if(index1!=N-1){
            for(int i=N-1;i>=0;i--){
                if(arr[i]>arr[index1]){
                    index2=i;
                    break;
                }
            }
            int temp1=arr[index1];
            arr[index1]=arr[index2];
            arr[index2]=temp1;
            int i=N-1;
            int j=index1+1;
            while(j<i){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i--;
                j++;
            }
            
            for(int l=0;l<N;l++){
                array.add(arr[l]);
            }
        }
        else{
            for(int i=N-1;i>=0;i--){
                array.add(arr[i]);
            }
        }
        for(int l=0;l<N;l++){
            System.out.print(array.get(l)+" ");
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,6,5,4};
        int N=6;
        nextPermutation(N,arr);
        
    }
        
}