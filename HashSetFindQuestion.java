//HashSet is a set where onl unique valueget stored
//To find intersaction between two arrays
import java.util.HashSet;
public class HashSetFindQuestion {
    public static void main(String[] args){
        int[] array1={7,3,9};
        int[] array2={6,3,9,2,9,4};
        HashSet<Integer> hash=new HashSet<>();
        for(int i=0;i<array1.length;i++){
            hash.add(array1[i]);
        }
        for(int j=0;j<array2.length;j++){
            if(hash.contains(array2[j])){
                System.out.println(array2[j]);
                hash.remove(array2[j]);
            }
        }
    }
}
