
//Reverse the array
public class ReverseArray{
    public static void findSum(int[] array){
        int start=0;
        int end=array.length-1;
        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] array={-2, 1, 5, 3,8};
        findSum(array);
    }
}