import java.util.*;
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int len=Integer.MAX_VALUE;
       int sum=0;
       int left=0;
       for(int right=0;right<nums.length;right++){

        sum+=nums[right];// add krenge jab tak sum bada na ho jaye [2,3,1,2]

             while(sum>=target){//8>7 so find length using right-left+1;
                len=Math.min(len,right-left+1);// len=4;
                sum-=nums[left]; // subtract from starting at left=0; now [3,1,2]
                left++;
             }
        }
        return (len==Integer.MAX_VALUE)?0:len;
    }
}