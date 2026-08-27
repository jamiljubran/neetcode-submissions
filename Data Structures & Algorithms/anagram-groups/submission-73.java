class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs)
        {
            char[] sortedS = s.toCharArray();
            Arrays.sort(sortedS);
            String fuckYou = Arrays.toString(sortedS);

            map.putIfAbsent(fuckYou, new ArrayList<>());
            map.get(fuckYou).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
