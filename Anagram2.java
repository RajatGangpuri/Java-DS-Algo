import java.util.*;
public class Anagram2 {
    public static boolean find(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        char[] chara=a.toCharArray();
        char[] charb=b.toCharArray();
        Arrays.sort(chara);
        Arrays.sort(charb);
        String stra=String.valueOf(chara);
        String strb=String.valueOf(charb);
        return stra.equals(strb);
    }
    public static void main(String[] args){
        String String1="tan";
        String String2="nat";
        System.out.print(find(String1,String2));
    }
}
