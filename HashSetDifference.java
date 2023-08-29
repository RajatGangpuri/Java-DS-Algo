//Hashmap Difference in two number
import java.util.*;

public class HashSetDifference {
    public static void main(String[] args){
        int[] array={1, 5, 2, 2, 2, 5, 5, 4};
        int k=3;
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0; i<array.length; i++){
            hash.put(array[i],0);
        }
        for(Map.Entry <Integer,Integer>e:hash.entrySet()){
            if(hash.containsKey(e.getKey()-k)){
                System.out.println(e.getKey()+" "+(e.getKey()-k));
            }
        }
    } 
}
