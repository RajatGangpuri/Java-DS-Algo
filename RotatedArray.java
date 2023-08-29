
//Quick Sort 
//Time complexity is 0(n^2)
//Find Pair with Sum in Sorted & Rotated Array
public class RotatedArray {
    public static int quickSort(int[] array,int low,int high){
        int i=low-1;
        int pivot=high;
        for(int j=low;j<high;j++){
            if(array[j]<array[pivot]){
                i++;
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        i++;
        int temp=array[pivot];
        array[pivot]=array[i];
        array[i]=temp;
        return i;
    }
    public static void divide(int[] array,int low,int high){
        if(low<high){
            int pi=quickSort(array,low,high);
            divide(array,low,pi-1);
            divide(array,pi+1,high);
        }
    }
    public static void main(String[] args){
        int[] array={11, 15, 6, 8, 9, 10};
        int num=array.length-1;
        int k=16;
        divide(array,0,num);
        int i=0;
        int j=array.length-1;
        while(i!=j){
            if(array[i]+array[j]<k){
                i--;
            }
            else if(array[i]+array[j]>k){
                j--;
            }
            else{
                System.out.println(array[i]);
                System.out.println(array[j]);
                return;
            }
        }
        
    }
}