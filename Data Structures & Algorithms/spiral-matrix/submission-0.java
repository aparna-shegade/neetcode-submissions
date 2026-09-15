class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int r=matrix.length;
        int c=matrix[0].length;
        int firstrow=0;
        int lastcol=c-1;
        int lastrow=r-1;
        int firstcol=0;
        while(firstrow<=lastrow && firstcol<=lastcol)
        {
            for(int j=firstcol;j<=lastcol;j++)
            {
                ans.add(matrix[firstrow][j]);
            }
            firstrow++;
            if(firstrow>lastrow || firstcol>lastcol)
            break;

            for(int i=firstrow;i<=lastrow;i++)
            {
                ans.add(matrix[i][lastcol]);
            }
            lastcol--;
            if(firstrow>lastrow || firstcol>lastcol)
            break;

            for(int j=lastcol;j>=firstcol;j--)
            {
                ans.add(matrix[lastrow][j]);
            }
            lastrow--;
            if(firstrow>lastrow || firstcol>lastcol)
            break;

            for(int i=lastrow;i>=firstrow;i--)
            {
                ans.add(matrix[i][firstcol]);
            }
            firstcol++;


        }
        return ans;
    }
}
