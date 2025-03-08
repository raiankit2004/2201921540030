import java.util.*;
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int ans=n+1;
       for(int i=0;i<=n-k;i++){
        int count=0;
        for(int j=i;j<i+k;j++){
            if(blocks.charAt(j)=='W'){
              count++;
            }
        }
        ans=Math.min(ans,count);
       }
       return ans;
    }
}