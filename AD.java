//Find minimum number of merge operations to make an array palindrome

public class AD {
    public static int characterReplacement(String s, int k) {
        int[] charCounts = new int[26];
        int maxCount = 0; // The count of the most frequent character
        int maxLength = 0; // The length of the longest valid substring
        int start = 0; // Start of the current window

        for (int end = 0; end < s.length(); end++) {
            charCounts[s.charAt(end) - 'A']++; // Increment the count of the current character
            maxCount = Math.max(maxCount, charCounts[s.charAt(end) - 'A']); // Update maxCount
            System.out.println(maxCount);

            // Calculate the length of the current window and check if we need to shrink it
            if (end - start + 1 - maxCount > k) {
                charCounts[s.charAt(start) - 'A']--; // Decrement count for the character going out of the window
                start++; // Shrink the window
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
    
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        int result = characterReplacement(s, k);
        System.out.println("Length of the longest repeating character replacement: " + result);
    }   
}