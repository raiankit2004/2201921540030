class Solution {
    public long coloredCells(int n) {
        if(n==1)return 1;
        long ans=2L*n*(n-1)+1;
   return ans;
    }
}