class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for(int num : nums)
        {
            numSet.add(num);
        }
        int longest = 0;
        for(int num : numSet)
        {
            if(!numSet.contains(num -1))
            {
                int curStreak = 1;
                int curNum = num;
                while(numSet.contains(curNum+1))
                {
                    curStreak++;
                    curNum++;
                }
                longest = Math.max(longest,curStreak);
            }
        }
        return longest;
        
    }
}
