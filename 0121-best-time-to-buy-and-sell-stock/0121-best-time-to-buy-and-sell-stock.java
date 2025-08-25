class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=0;
        int buy=prices[0];
        for(int i=1;i<n;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }
            else{
                max=Math.max(max,prices[i]-buy);
            }
        }
        return max;
    }
}