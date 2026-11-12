class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> count = new HashMap<>();

        for(int num : nums)
        {
            count.put(num,count.getOrDefault(num,0)+1);
        }        

        List<Integer> key = new ArrayList<>(count.keySet());
        key.sort((a,b) -> count.get(b) - count.get(a));

        int[] result = new int[k];

        for(int i = 0; i < k; i++)
        {
            result[i] = key.get(i);
        }
        return result;
    }
}
