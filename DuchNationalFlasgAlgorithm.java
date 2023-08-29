

//Dutch National flag algorithm
// https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

//Sort an array of 0s, 1s and 2s

public class DuchNationalFlasgAlgorithm{

    public static void check(int[] array){
        int low=0;
        int high=array.length-1;
        int mid=0;
        while(mid<=high){
            if(array[mid]==0){
                int temp=array[mid];
                array[mid]=array[low];
                array[low]=temp;
                low++;
                mid++;
            }
            else if(array[mid]==1){
                mid++;
            }
            else{
                int temp=array[high];
                array[high]=array[mid];
                array[mid]=temp;
                high--;
            }
        }
    }
    public static void main(String[] args){
        int[] array={1,2,0,2,0,1};
        check(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}