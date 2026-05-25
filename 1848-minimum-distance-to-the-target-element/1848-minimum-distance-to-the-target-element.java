import java.util.*;
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n=nums.length;
        int c=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if((nums[i]==target)){
                c= Math.min(c, Math.abs(i - start));
               
            }
        }
        return c;
    }
}