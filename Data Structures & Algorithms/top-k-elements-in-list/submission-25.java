class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            int count = map.getOrDefault(num,0);
            map.put(num,count+1);
        }
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            minHeap.offer(new int[] {entry.getValue(), entry.getKey()});
            if(minHeap.size() > k)
            {
                minHeap.poll();
            }

        }
        int[] result = new int[k];
        for(int i = k - 1; i >= 0; i--)
        {
            result[i] = minHeap.poll()[1];
        }
        return result;
    }
}
