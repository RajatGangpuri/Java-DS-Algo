//HashMap 
//Find all the elements in an given array that appear more than n/3 times
import java.util.HashMap;
import java.util.Map;

public class HashFindElements {
    public static void main(String[] args){
        int[] array={1,2};
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<array.length;i++){
            int count=1;
            if(hash.containsKey(array[i])){
                count = hash.get(array[i]) + 1;
            }
            hash.put(array[i], count);
        }
        for(Map.Entry<Integer,Integer> e : hash.entrySet()){
            if(e.getValue()>array.length/3){
                System.out.println(e.getKey());
            }
            
        }      
    }
}
