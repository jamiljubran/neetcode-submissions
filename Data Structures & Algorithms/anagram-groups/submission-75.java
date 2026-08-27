class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs)
        {
            char[] sortedS = s.toCharArray();
            Arrays.sort(sortedS);
            String bisa = Arrays.toString(sortedS);

            map.putIfAbsent(bisa, new ArrayList<>());
            map.get(bisa).add(s);
        }
        return new ArrayList<>(map.values());
        
    }
}
