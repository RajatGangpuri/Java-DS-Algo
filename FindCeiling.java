
//Ceiling in a sorted array

//https://www.geeksforgeeks.org/ceiling-in-a-sorted-array/

public class FindCeiling{
    public static int find(int[] array,int k){
        if(k<=array[0]){
            return array[0];
        }
        if(k>array[array.length-1]){
            return -1;
        }

        for(int i=0;i<array.length-1;i++){
            if(k==array[i]){
                return array[i];
            }
            else if(k==array[i+1]){
                return array[i+1];
            }
            else if(k>array[i] && k<array[i+1]){
                return array[i+1];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] array1={1, 2, 8, 10, 10, 12, 19};
        int k=2;
        if(find(array1,k)==-1){
            System.out.print("Not exist");
        }
        else{
            System.out.print("exist at index" +find(array1,k));
        }
        
    }
}