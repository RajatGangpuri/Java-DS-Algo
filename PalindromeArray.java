//palindrome in integer 
public class PalindromeArray {
    public static void palindrome(String num){
        int start=0;
        int end=num.length()-1;
        int mid=num.length()/2;
        while(start!=mid){
            if(num.charAt(start)!=num.charAt(end)){
                System.out.print("false");
                return;
            }
            start=start+1;
            end=end-1;
        }
        System.out.print("true");
    }
        
    public static void main(String[] args){
        int value=13231;
        String num=value+"";
        palindrome(num);
    }
}
