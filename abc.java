import java.util.*;
public class abc {

    public static boolean isSubarraySortedAfterReverse(int[] arr, int start, int end) {
        int[] sortedArr = arr.clone(); // Make a copy of the original array
        Arrays.sort(sortedArr, start, end + 1); // Sort the subarray
        
        // Reverse the subarray in the original array
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        // Compare the reversed subarray with the sorted subarray
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != sortedArr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 5, 9, 10}; // Modify this array as needed
        int start = 1; // Modify the start index of the subarray
        int end = 3; // Modify the end index of the subarray
        
        boolean isSortedAfterReverse = isSubarraySortedAfterReverse(array, start, end);
        if (isSortedAfterReverse) {
            System.out.println("Reversing the subarray makes the array sorted.");
        } else {
            System.out.println("Reversing the subarray does not make the array sorted.");
        }
    }
}
