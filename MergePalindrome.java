//count operation needed to merge array element to make it palindrome
public class MergePalindrome{
    public static void palindrome(int[] nums){
        int count=0;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(nums[i]==nums[j]){
                i++;
                j--;
            }
            else if(nums[i]<nums[j]){
                i++;
                nums[i]=nums[i]+nums[i-1];
                count++;
            }
            else{
                j--;
                nums[j]=nums[j]+nums[j-1];
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        int[] nums={11, 14, 15, 99};
        palindrome(nums);
    }
}