import java.lang.Math;
class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int reachable=0;
        for(int i=0;i<=reachable;i++){
            reachable=Math.max(reachable,i+nums[i]);
            if(reachable>=n-1)return true;
        }
        return false;
    }
}