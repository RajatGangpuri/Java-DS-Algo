//HashMap Determine whether two strings are anagram or not
import java.util.*;

public class HashMapDetermineString {
    public static boolean find(){
        String str1="tommarvoloriddle";
        String str2="iamlordvoldemort";
        if(str1.length()==str2.length()){
            HashMap<Character, Integer> hash = new HashMap<>();
            HashMap<Character, Integer> map = new HashMap<>();
            for(int i=0;i<str1.length();i++){
                hash.put(str1.charAt(i),0);
                map.put(str2.charAt(i),0);
            }
            for(Map.Entry <Character,Integer> e:hash.entrySet()){
                if(!map.containsKey(e.getKey())){
                    System.out.println("not exist");
                    return false;
                }
                
            }
            return hash.equals(map);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        System.out.println(find());
    }
}
