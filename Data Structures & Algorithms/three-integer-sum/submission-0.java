class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
               int sum=nums[i]+nums[j]+nums[k];
               if(sum==0)
               {
                ArrayList<Integer> temp=new ArrayList<>();
                temp.add(nums[i]);
                temp.add(nums[j]);
                temp.add(nums[k]);
                ans.add(temp);
                j++;
                k--;
               }
               else if(sum<0)
               {
                j++;
               }
               else
               k--;
               
            }
        }
        HashSet<List<Integer>> set=new HashSet<>(ans);
        return new ArrayList<>(set);
    }
}
