class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        if(s.length() != t.length())
        {
            return false;
        }

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        for(int i = 0; i < s.length(); i++)
        {
            map.put(sChar[i],map.getOrDefault(sChar[i], 0)+1);
        }
        for(int i = 0; i < t.length(); i++)
        {
            map.put(tChar[i],map.getOrDefault(tChar[i], 0)-1);
        }

        for(int count : map.values())
        {
            if( count != 0)
            {
                return false;
            }
        }
        return true;


    }
}
