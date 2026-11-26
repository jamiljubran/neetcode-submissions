class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs)
        {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            
            String charss = new String(chars);
            if(!map.containsKey(charss))
            {
                map.put(charss, new ArrayList<>());
            }
                map.get(charss).add(str);
            
          
        }
          return  new ArrayList<>(map.values());
        
        
    }
}
