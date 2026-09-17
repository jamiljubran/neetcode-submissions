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
            int currentStreak = 1;
            int currentNum = num;
            
                while(numSet.contains(currentNum + 1))
                {
                    currentStreak++;
                 currentNum++;
                }
                longest = Math.max(longest,currentStreak);
            }
        }
        return longest;
        
    }

}