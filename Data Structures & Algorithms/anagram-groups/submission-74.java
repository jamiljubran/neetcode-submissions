class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs)
        {
            char[] sortedS = s.toCharArray();
            Arrays.sort(sortedS);
            String nastya = Arrays.toString(sortedS);

            map.putIfAbsent(nastya, new ArrayList<>());
            map.get(nastya).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
