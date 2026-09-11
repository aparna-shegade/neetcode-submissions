class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0)
        return 0;
        Arrays.sort(nums);
        int len=1;
        int maxLen=Integer.MIN_VALUE;
        for(int i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1])
            continue;

            else if(nums[i]==nums[i-1]+1)
            {
                len++;
            }
            else
            {
                maxLen=Math.max(maxLen,len);
                len=1;
            }
        }
        maxLen=Math.max(maxLen,len);
        return maxLen;
    }
}
