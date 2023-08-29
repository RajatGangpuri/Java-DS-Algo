
// Duplicate in String
import java.util.*;
public class StringDuplicateString{
    public static void sort(String a){
        HashMap<Character,Integer> hash=new HashMap<>();
        for(int i=0;i<a.length();i++){
            Character c=a.charAt(i);
            if(hash.containsKey(c)){
                hash.put(c,hash.get(c)+1);
            }
            else{
                hash.put(c,0);
            }
            
        }
        for(Map.Entry<Character,Integer> e:hash.entrySet()){
            if(e.getValue()!=0){
                System.out.println(e.getKey());
            }
        }
    }
    public static void main(String[] args){
        String a="test string";
        sort(a);
    }
}