//HashMap Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
import java.util.HashMap;
class Check {
    public static int[] find(int[] nums,int target){
        HashMap <Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(target-nums[i])){
                return new int[] { hash.get(target-nums[i]), i };
            }
            hash.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args){
        int[] nums= {2,7,11,15};
        int target=9;
        int[] result = find(nums,target);
        System.out.println(result[0] + " " + result[1]);
    }
}