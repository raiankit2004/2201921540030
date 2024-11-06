class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n<2)
            return nums[0];
        int[] skiplast = new int[n-1];
        int[] skipfirst = new int[n-1];
        for(int i=0;i<n-1;i++){
            skiplast[i]=nums[i];
            skipfirst[i]=nums[i+1];
        }
            int lootskiplast= robber(skiplast);
            int lootskipfirst= robber(skipfirst);
            
            return Math.max(lootskiplast,lootskipfirst);
        }
          public int robber(int[] nums) {
        int n=nums.length;
        if(n<2){
            return nums[0];
        }
        int[] dp = new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[n-1];
      }
    }
