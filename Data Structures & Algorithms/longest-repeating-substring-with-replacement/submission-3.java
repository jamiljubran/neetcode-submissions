class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0; 
        int best = 0;
        int maxFreq = 0;
        int[] count = new int[26];

        for(int right = 0; right < s.length(); right++)
        {
            int letter = s.charAt(right);
            int index = letter - 'A';
            count[index]++;
            maxFreq = Math.max(maxFreq, count[index]);

            while((right - left + 1)- maxFreq > k)
            {
                char leftLetter = s.charAt(left);
                count[leftLetter - 'A']--;
                left++;
            }
            best = Math.max(best, right - left + 1);
        }
        return best;
        
    }
}
