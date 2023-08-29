
//Pair sum sum is equal to target use two pointer approach

import java.util.*;
public class ArrayPairSum {
    public static boolean it(ArrayList<Integer> array) {
        int left=0;
        int right=array.size()-1;
        while(left<right){
            if(array.get(left)+array.get(right)==5){
                return true;
            }
            else if(array.get(left)+array.get(right)>5){
                right--;
            }
            else{
                left++;
            }
        }
        return false;
    }
    public static void main(String[] args){
        ArrayList<Integer> array=new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        System.out.print(it(array));
    }
}
