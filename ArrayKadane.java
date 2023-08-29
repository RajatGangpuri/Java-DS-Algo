//Maximum sum of subarray Kadanes algorith workin all condition
//subarray sum is different from contiguous subarray
//To find contiguous maximum sum the code is diiferent


public class ArrayKadane {
    public static int find(int[] array) {
        int max = array[0];
        int sum = array[0];
        
        for (int i = 1; i < array.length; i++) {
            sum = Math.max(array[i], sum + array[i]);
            max = Math.max(max, sum);
        }
        
        return max;
    }
    
    public static void main(String[] args) {
        int[] negativeArray = {-2, -1, -3, -4, -1, -2, -1, -5, -4};
        int[] mixedArray = {34,56,12,89,-2,-45,21,4,-5,-9};
        
        System.out.println(find(negativeArray));  // Output: -1 (maximum negative element)
        System.out.println(find(mixedArray));     // Output: 6 (maximum sum of a subarray)
    }
}
