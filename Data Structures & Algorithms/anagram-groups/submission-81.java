class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(String str : strs)
        {
            char[] sortedS = str.toCharArray();
            Arrays.sort(sortedS);
            String sortedString = new String(sortedS);

            if(!map.containsKey(sortedString))
            {
                map.put(sortedString, new ArrayList<String>());
            }
            map.get(sortedString).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
