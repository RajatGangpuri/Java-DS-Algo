
class Solution {
    public boolean StringPalindromeAfterRemoving(String s) {
        StringBuilder sb=new StringBuilder();
        char[] ch=s.toCharArray();
        for( char str: ch){
            if (Character.isLetterOrDigit(str)) {
                sb.append(Character.toLowerCase(str));
            }
        }
        int start=0;
        int end=sb.length()-1;
        while(start<end){
            if(sb.charAt(start)!=sb.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}