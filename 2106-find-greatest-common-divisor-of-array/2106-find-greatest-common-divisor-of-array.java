import java.util.*;
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
      int n=nums.length;
      int min=Integer.MAX_VALUE;
      int max=Integer.MIN_VALUE;
      int gcd=1;
      for(int i=0;i<n;i++){
        min=Math.min(min,nums[i]);
        max=Math.max(max,nums[i]);
       } 
       for(int i=1;i<=min && i<=max;i++){
            if(min%i==0 && max%i==0){
                gcd=i;
            }
        }
      return gcd;
    }
}