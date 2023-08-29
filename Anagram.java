//is Anagram??
public class Anagram{
    public static boolean sort(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        else{
            int[] count=new int[26];
            for(int i=0;i<a.length();i++){
                count[a.charAt(i)-'a']++;
            }
            for(int i=0;i<b.length();i++){
                count[b.charAt(i)-'a']--;
            }
            for(int i=0;i<count.length;i++){
                if(count[i]!=0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        String a="anagram";
        String b="gramana";
        System.out.println(sort(a,b));
    }
}