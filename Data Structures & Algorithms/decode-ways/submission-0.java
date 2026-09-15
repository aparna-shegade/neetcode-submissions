class Solution {
    int[] dp;
    
    int solve(String s,int index)
    {
        int n=s.length();
        if(index==n)
        return 1;

        if(s.charAt(index)=='0')
        return 0;

        if(dp[index]!=-1)
        return dp[index];
        
        int one=solve(s,index+1);

        int two=0;
        if(index+1<s.length())
        {
            int num=Integer.parseInt(s.substring(index,index+2));
            if(num>=10 && num<=26)
            two=solve(s,index+2);
        }
        return dp[index]=one+two;
    }


    public int numDecodings(String s) {
        dp=new int[s.length()];
        Arrays.fill(dp,-1);
        return solve(s,0);
    }
}
