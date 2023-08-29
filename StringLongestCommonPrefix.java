import java.util.Arrays;
class StringLongestCommonPrefix {
    public static String longestCommonPrefix(String[] str) {
        if (str == null || str.length == 0) {
        return "";
        }
        if (str.length == 1) {
        return str[0];
        }
        String a=str[0];
        String b=str[str.length-1];
        int index=0;
        while(index<a.length() && index<b.length()){
            if(a.charAt(index)==b.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        return a.substring(0,index);
    }
    public static void main(String[] args){
        String[] str={"aaa","aa","aaa"};
        Arrays.sort(str);
        System.out.println(longestCommonPrefix(str));
    }
}
