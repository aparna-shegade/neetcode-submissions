class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int max=Integer.MIN_VALUE;
        int curr=0;
        int h=0;
        int w=0;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            w=j-i;
            h=Math.min(heights[i],heights[j]);
            curr=w*h;
            max=Math.max(curr,max);

            if(heights[i]<heights[j])
            {
                i++;
            }
            else
            j--;
        }
        return max;
    }
}
