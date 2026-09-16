class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(String str : strs)
        {
            char[] sortedStr = str.toCharArray();
            Arrays.sort(sortedStr);
            String sortedS = new String(sortedStr);

            if(!map.containsKey(sortedS))
            {
                map.put(sortedS, new ArrayList<String>());
            }
            map.get(sortedS).add(str);

        }
        return new ArrayList<>(map.values());
        
    }
}
