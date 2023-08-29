//https://www.geeksforgeeks.org/permute-two-arrays-sum-every-pair-greater-equal-k/
//Permute two arrays such that sum of every pair is greater or equal to K



public class ArraySum{
    public static int find(int[] array){
        int count=0;
        for(int i=0;i<array.length;i++){
            int j=i-1;
            count=count+1;
            while(j>=0){
                if(array[i]==array[j]){
                    count=count-1;
                }
                j--;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] array={1, 4, 1, 2, 7, 5, 2};
        System.out.println(find(array));
    }
}