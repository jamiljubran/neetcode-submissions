class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();

        for(String str : strs)
        {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String keys = new String(chars);
            if(!map.containsKey(keys))
            {
                map.put(keys, new ArrayList<>());
            }
            map.get(keys).add(str);
        }
        return new ArrayList<>(map.values());
        
    }
}
