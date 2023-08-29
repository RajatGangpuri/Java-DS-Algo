
//find sum of max and minimum in an array
public class ArraySumMaxAndMin{
    public static int findSum(int[] array){
        int max=array[0],min=array[0];
        for(int i=0;i<array.length-1;i++){
            int c=Math.max(array[i],array[i+1]);
            if(c>max){
                max=c;
            }
            int d=Math.min(array[i],array[i+1]);
            if(d<min){
                min=d;
            }
        }
        return max+min;
    }
    public static void main(String[] args){
        int[] array={-2, 1, -4, 5, 3};
        System.out.print(findSum(array));
    }
}