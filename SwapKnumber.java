// Swap numbers in array by k numbers
class SwapKnumber {
    public static int[] search(int[] nums, int target) {
        int j=0;
        while(j<target){
            int current=nums[0];
            for(int i=0;i<nums.length-1;i++){
                nums[i]=nums[i+1];
            }
            nums[nums.length-1]=current;
            j++;
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums={84,26,34,4,56};
        int target=3;
        search(nums,target);
    }
}
