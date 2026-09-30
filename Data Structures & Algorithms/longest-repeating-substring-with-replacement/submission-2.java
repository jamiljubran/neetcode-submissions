class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxFreq = 0;
        int best = 0;

        for(int right = 0; right < s.length(); right++)
        {
            char letter = s.charAt(right);
            int box = letter - 'A';
            count[box]++;
            maxFreq = Math.max(maxFreq, count[box]);
        
        while((right - left + 1) - maxFreq > k)
        {
            char leftLetter = s.charAt(left);
            count[leftLetter - 'A'] --;
            left++;
        }
        best = Math.max(best,right-left+1);

        
    }
    return best;
    }
}
