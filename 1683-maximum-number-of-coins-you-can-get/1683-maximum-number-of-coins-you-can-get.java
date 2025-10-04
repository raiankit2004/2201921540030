import java.util.*;
class Solution {
    public int maxCoins(int[] piles) {
        int n=piles.length;
        Arrays.sort(piles);    //1,2,2,4,7,8;
        int sum=0;
        int k=0;
        for(int i=n-1;i>k;i=i-2){
        int alice=piles[i];  //8
        int me=piles[i-1];       //7;
              sum+=me;     //0+7=7; 
        int bob=piles[k++];      //1;
       }
    return sum;
}
}