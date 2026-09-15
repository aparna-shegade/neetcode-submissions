class Solution {
    int[] dp;
    
    int solve(int[] nums,int index,int end)
    {
        int n=nums.length;
        if(index>end)
        return 0;

        if(dp[index]!=-1)
        return dp[index];

        int steal=nums[index]+solve(nums,index+2,end);
        int skip=solve(nums,index+1,end);

        return dp[index]=Math.max(steal,skip);


    }

    int rob(int[] nums,int start,int end)
    {
        int n=nums.length;
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(nums,start,end);
    }


    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
        return nums[0];

        int case1=rob(nums,0,n-2);
        int case2=rob(nums,1,n-1);
        return Math.max(case1,case2);
    }
}
