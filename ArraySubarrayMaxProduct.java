//Maximum product of subarray Kadanes algorith workin all condition

class ArraySubarrayMaxProduct {
    public static int maxProduct(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int overall=nums[0];
        for(int i=1;i<nums.length;i++){
            int tempmax=Math.max(Math.max(max*nums[i],min*nums[i]),nums[i]);
            int tempmin=Math.min(Math.min(max*nums[i],min*nums[i]),nums[i]);
            max=tempmax;
            min=tempmin;
            overall=Math.max(overall,max);
        }
        return overall;
    }
    public static void main(String[] args){
        int[] array={-4,-3,-2};
        System.out.println(maxProduct(array));
    }
}