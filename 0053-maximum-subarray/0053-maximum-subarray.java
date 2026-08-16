class Solution {
    public int maxSubArray(int[] nums) {
        int csum = 0; int max_sum = Integer.MIN_VALUE;

        for(int i =0;i<nums.length;i++){
            csum += nums[i];
            max_sum = Math.max(csum,max_sum);
            if(csum < 0){
                csum =0;
            }
        }
        return max_sum;
    }
}