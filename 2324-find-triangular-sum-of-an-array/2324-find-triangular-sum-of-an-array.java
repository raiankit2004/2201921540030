class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;

        while(n>1){
            for(int i=1;i<n;i++){
             nums[i-1]=(nums[i-1]+nums[i])%10;  //%10 because sum ones digit we want only
            }
            n--;
        }
        return nums[0];
    }
}