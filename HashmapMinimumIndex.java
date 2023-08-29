//Hashmap Find the minimum index of a repeating element in an array
import java.util.*;

public class HashmapMinimumIndex {
    public static void main(String[] args){
        int[] array={5,6, 3, 4, 3, 4,6};
        int j=array.length;
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(hash.containsKey(array[i])){
                int index=hash.get(array[i]);
                if(index<j){
                    j=index;
                }
            }
            else{
                hash.put(array[i],i);
            }
        }
        if(j==array.length){
            System.out.println("Invalid input");
        }
        else{
            System.out.println(j);
        }
    } 
}
