import java.util.*;
class Solution {
    public int[] transformArray(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        int k=0;
        int l=0;
        for(int i=0;i<n;i++){
            nums[i]=(nums[i]%2==0)?0:1;
            }
        Arrays.sort(nums);
        return nums;
    }
}