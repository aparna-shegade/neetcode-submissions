class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        int maxEnding=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            maxEnding=Math.max(nums[i],nums[i]+maxEnding);
            res=Math.max(res,maxEnding);
        }
        return res;
    }
}
