
//pair sum sum is equal to target use two pointer approach
// in rotated and sorted array

import java.util.*;
public class ArrayTwoSumRotatedArray {
    public static boolean it(ArrayList<Integer> array) {
        int bp=-1;

        for(int i=0;i<array.size();i++){
            if(array.get(i)>array.get(i+1)){
                bp=i;
                break;
            }
        }
        int right=bp;
        int left=bp+1;
        while(left!=right){
            if(array.get(left)+array.get(right)==16){
                return true;
            }
            else if(array.get(left)+array.get(right)<16){
                left=(left+1)%array.size();
            }
            else{
                right=(array.size()+right-1)%array.size();
            }
        }
        return false;
    }
    public static void main(String[] args){
        ArrayList<Integer> array=new ArrayList<>();
        array.add(11);
        array.add(15);
        array.add(6);
        array.add(8);
        array.add(9);
        array.add(10);
        System.out.print(it(array));
    }
}
