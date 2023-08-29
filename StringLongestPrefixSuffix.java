// Knuth-Morris-Pratt (KMP) algorithm

public class StringLongestPrefixSuffix {
    public static int longestPrefixSuffix(String str) {
        int n = str.length();
        int[] lps = new int[n];
        int l = 0;  // Length of the previous longest prefix suffix
        int i = 1;
        
        while (i < n) {
            if (str.charAt(i) == str.charAt(l)) {
                l++;
                lps[i] = l;
                i++;
            } else {
                if (l != 0) {
                    l = lps[l - 1];
                } else {
                    lps[l] = 0;
                    i++;
                }
            }
        }
        return lps[n - 1];
    }
    
    public static void main(String[] args) {
        String str = "ababa";
        int longestPS = longestPrefixSuffix(str);
        System.out.println("Longest Prefix-Suffix Length: " + longestPS);
        
    }
}

