class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int maxLen = 0;

        for(int i = 0; i < s.length(); i++)
        {
            int line1 = expand(s,i,i);
            int line2 = expand(s,i,i+1);
            int len = Math.max(line1,line2);
            if(len > maxLen)
            {
                maxLen = len;
            
            start = i - (len-1)/2;
            }
        }
        return s.substring(start,start+maxLen);
        
    }
    public int expand(String s, int left, int right)
    {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
        {
            right++;
            left--;

        }
        return right - left - 1;
    }
}
