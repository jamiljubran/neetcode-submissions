class Solution {
    public int countComponents(int n, int[][] edges) {
        int[] parent = new int[n];
        int count = n;

        for(int i = 0; i < n; i++)
        {
            parent[i] = i;
        }
        for(int[] edge : edges)
        {
            int rootA = find(parent,edge[0]);
            int rootB = find(parent,edge[1]);

            if(rootA != rootB)
            {
                parent[rootA] = rootB;
                count--;
            }
        }
        return count;
    }

    public int find(int[] parent, int x)
    {
        while(parent[x] != x)
        {
            x = parent[x];
        }
        return x;
    }
}
