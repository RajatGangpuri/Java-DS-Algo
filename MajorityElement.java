
//Majority element

//https://www.geeksforgeeks.org/majority-element/
import java.util.*;

public class MajorityElement{
    public static int find(int[] array){
        int n=array.length;
        HashMap <Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(hash.containsKey(array[i])){
                hash.put(array[i],hash.get(array[i])+1);
                if(hash.get(array[i])>=n/2){
                    return array[i];
                }

            }
            else{
                hash.put(array[i],1);
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] array={3,3,3,3,4,4,4,4};
        if(find(array)==-1){
            System.out.print("Not exist");
        }
        else{
            System.out.print(find(array));
        }
    }
}