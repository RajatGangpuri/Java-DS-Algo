import java.util.*;

class StringLargestNumber {
    public static String largestNumber(int[] nums) {
        // Convert numbers to strings
        String[] numStrings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrings[i] = String.valueOf(nums[i]);
        }
        
        
        // Implement custom comparator
        Comparator<String> customComparator = new Comparator<String>() {
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); // Compare in descending order
            }
        };
        
        // Sort the numbers using the custom comparator
        Arrays.sort(numStrings, customComparator);
        
        // Handle the case where all numbers are zero
        if (numStrings[0].equals("0")) {
            return "0";
        }
        
        // Concatenate the sorted numbers to form the biggest number
        StringBuilder sb = new StringBuilder();
        for (String num : numStrings) {
            sb.append(num);
        }
        
        return sb.toString();
    }
    public static void main(String[] args) {
        int[] nums = {0,10, 2, 30, 5, 9};
        String largestNum = largestNumber(nums);
        System.out.println("Largest number: " + largestNum);
    }
}
