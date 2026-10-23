class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        boolean[] zeroR = new boolean [row];
        boolean[] zeroC = new boolean [col];

        for(int r = 0; r < row; r++)
        {
            for(int c = 0; c < col; c++)
            {
                if(matrix[r][c] == 0)
                {
                    zeroR[r] = true;
                    zeroC[c] = true;
                }
            }
        }
        for(int r = 0; r < row; r++)
        {
            for(int c = 0; c < col; c++)
            {
                if(zeroR[r] || zeroC[c])
                {
                    matrix[r][c] = 0;
                }
            }
        }
    }
}
