class Solution {
    int[] dp;
    
    int solve(int[] nums,int index)
    {
        int n=nums.length;
        if(index>=n)
        return 0;

        if(dp[index]!=-1)
        return dp[index];

        int steal=nums[index]+solve(nums,index+2);
        int skip=solve(nums,index+1);

        return dp[index]=Math.max(steal,skip);
    }

    public int rob(int[] nums) {
        int n=nums.length;
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(nums,0);
    }
}
