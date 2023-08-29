
//Max subarray Sum

class MaxSubarraySum {
    public static int[] maxSubArray(int[] nums) {
        int msf = Integer.MIN_VALUE;
        int meh = 0;
        int start = 0;
        int end = 0;
        int currentstart = 0;
        for (int i = 0; i < nums.length; i++) {
            meh = meh + nums[i];
            if (meh < nums[i]) {
                meh = nums[i];
                currentstart = i;
            }
            if (msf < meh) {
                msf = meh;
                start = currentstart;
                end = i;
            }
        }
        int[] result = new int[end - start + 1];
        start =currentstart;
        for (int i = currentstart; i <= end; i++) {
            result[i - start] = nums[i];
        }
        System.out.print("Max sum subarray: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        return new int[]{msf, start, end};
    }
    
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] result = maxSubArray(nums);
        System.out.println("Max sum: " + result[0] + ", start index: " + result[1] + ", end index: " + result[2]);
    }
    
}
