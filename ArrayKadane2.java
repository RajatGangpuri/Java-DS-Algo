
//Maximum sum of contiguous subarray Kadanes2 algorith workin all condition
//subarray sum is different from contiguous subarray
//To find maximum subarray sum the code is diiferent

public class ArrayKadane2 {
    public static int findMaxSubarraySum(int[] array) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];
            
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        int[] array = {2, -3, 5, -1, 6, -4, 2, 7, -5, 4};
        System.out.print(findMaxSubarraySum(array));
    }
}
