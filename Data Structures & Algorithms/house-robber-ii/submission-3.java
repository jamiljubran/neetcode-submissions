class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];   // one house: it isn't its own neighbor

        int skipLast  = robLine(nums, 0, nums.length - 2);
        int skipFirst = robLine(nums, 1, nums.length - 1);
        return Math.max(skipLast, skipFirst);
    }

    private int robLine(int[] nums, int start, int end) {
        int prev2 = 0;
        int prev1 = 0;

        for (int i = start; i <= end; i++) {
            int current = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}

