public class BackTrackingPartD {
    public static void permutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newString=str.substring(0,i)+str.substring(i+1);
            permutation(newString,ans+curr);
        }
    }
    public static void main(String[] args){
        permutation("abc","");
    }
}
