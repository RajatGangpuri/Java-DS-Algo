//Quick Sort 
//Time complexity is 0(n^2)

public class SortQuick {
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
        int[] array={89,34,23,9,67};
        int num=array.length-1;
        divide(array,0,num);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}