class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        long maxT=0;
        for(int i=0;i<n-1;i++){
         for(int k=n-1;k>i;k--){
            int j=i+1;
            while(j<k){
                maxT=Math.max(maxT,(long)(nums[i]-nums[j])*nums[k]);
                j++;
            }
            }
         }
         return Math.max(0,maxT);
            }
}