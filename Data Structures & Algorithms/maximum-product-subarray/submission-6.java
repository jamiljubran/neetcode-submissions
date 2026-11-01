class Solution {
    public int maxProduct(int[] nums) {
        int curMax = nums[0];
        int curMin = nums[0];
        int best = nums[0];

        for(int i = 1; i < nums.length; i++)
        {
            int num = nums[i];
            int a = curMax * num;
            int b = curMin * num;
            curMax = Math.max(num,Math.max(a,b));
            curMin = Math.min(num, Math.min(a,b));
            best = Math.max(best,curMax);
        }
        return best;
        
    }
}
