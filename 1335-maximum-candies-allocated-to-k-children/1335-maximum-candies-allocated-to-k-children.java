import java.util.*;
class Solution {
    public int maximumCandies(int[] candies, long k) {
        long n = candies.length;
        long low=1, high=0;
        for(int candy:candies){
           high=Math.max(high,candy);
        }
        long res=0;
        
        while(low<=high){
            long mid=(low+high)/2;
            long total_people=0;

            for(int candy:candies){
                total_people+=candy/mid;
            }
        if(total_people>=k){
            res=mid;
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
          return (int)res;
    }
}