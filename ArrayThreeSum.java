
import java.util.Arrays;
class ArrayThreeSum {
    public static int[] threeSum(int[] nums) {
        int[] temp=new int[3];
        
        for(int i=0;i<nums.length-3;i++){
            if(nums[i]+nums[i+1]+nums[i+2]==0){
                if(nums[i]!=nums[i+1] && nums[i+1]!=nums[i+2] && nums[i]!=nums[i+2]){
                    temp[0]=nums[i];
                    temp[1]=nums[i+1];
                    temp[2]=nums[i+2];
                    System.out.println(Arrays.toString(temp));
                }
            }
        }
        return temp; 
    }
    public static void main(String[] args){
        int[] nums={-1,0,1,2,-1,-4};
        threeSum(nums);;
    }
}