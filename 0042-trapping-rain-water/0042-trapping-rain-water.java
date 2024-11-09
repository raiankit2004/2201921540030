class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int leftmax=0;
        int rightmax=0;
        int l=0;
        int r=n-1;
        int ans=0;
        while(l<r){
            if(height[l]>leftmax){
               leftmax = Math.max(leftmax,height[l]);
            }
             if(height[r]>rightmax){
               rightmax = Math.max(rightmax,height[r]);
            }
            if(leftmax<rightmax){
                ans = ans+leftmax - height[l];
                l++;
            }
            else{
                ans=ans+rightmax - height[r];
                r--;
            }
        }
        return ans;
    }
}