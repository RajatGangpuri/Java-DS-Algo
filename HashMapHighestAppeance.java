//Hashmap Highest freuency of a number in a array
import java.util.*;

public class HashMapHighestAppeance {
    public static void main(String[] args){
        int[] array={2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2};
        HashMap<Integer,Integer> hash=new HashMap<>();
        int maxCount = 1;
        int maxElement = array[0];
        for(int i=0; i<array.length; i++){
            int key = array[i];
            if(hash.containsKey(key)){
                int count = hash.get(key) + 1;
                hash.put(key, count);
                if(count > maxCount){
                    maxCount = count;
                    maxElement = key;
                }
            } else {
                hash.put(key, 1);
            }
        }
        System.out.println("Element with highest frequency: " + maxElement);
    } 
}

