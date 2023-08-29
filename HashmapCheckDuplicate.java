//Hashmap Find duplicates within a range `k` in an array
import java.util.*;

public class HashmapCheckDuplicate {
    public static void main(String[] args){
        int[] array={ 5, 6, 8, 2, 4, 6, 9 };
        int k=8;
        if(k>array.length){
            k=array.length;
        }
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<k;i++){
            if(hash.containsKey(array[i])){
                System.out.println(array[i]);
            }
            else{
                hash.put(array[i],i);
            }
        }
    } 
}

