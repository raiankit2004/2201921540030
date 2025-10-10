import java.util.*;
class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n=energy.length;
        int max=Integer.MIN_VALUE;
        int dp[]=new int[n];
        for(int i=n-1;i>=0;i--){
            dp[i]=energy[i]; // dp[5]=1;dp[4]=-5;dp[3]=-10,dp[2]=2
            if(i+k<n){  //5+3=8>5 so move , 4+3=7>5 move,6>5, 4<5 so in loop
                dp[i]+=dp[i+k]; // dp[2]=dp[2]+dp[5] => dp[2]=2+1=3 ans
            }
           max=Math.max(max,dp[i]);
        }
        return max;
    }
}