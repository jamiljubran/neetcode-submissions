class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> window = new HashSet<>();

        int l = 0;
        int b = 0;

        for(int r = 0; r < s.length(); r++)
        {
            char c = s.charAt(r);

            while(window.contains(c))
            {
                window.remove(s.charAt(l));
                l++;
            }
            window.add(c);
            b = Math.max(b, r-l+1);
        }
        return b;
        
    }
}
