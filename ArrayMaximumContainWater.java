
//Maximum contain water
import java.util.*;
public class ArrayMaximumContainWater {
    public static int it(ArrayList<Integer> array) {
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=array.size()-1;
        while(left<right){
            int height=Math.min(array.get(left),array.get(right));
            int width=right-left;
            int val=height*width;
            max=Math.max(val,max);
            if(array.get(left)<array.get(right)){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args){
        ArrayList<Integer> array=new ArrayList<>();
        array.add(1);
        array.add(8);
        array.add(6);
        array.add(2);
        array.add(5);
        array.add(4);
        array.add(8);
        array.add(3);
        array.add(7);
        System.out.print(it(array));
    }
}
