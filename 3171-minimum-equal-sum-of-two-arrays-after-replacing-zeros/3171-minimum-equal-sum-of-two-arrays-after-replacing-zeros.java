import java.util.*;
class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        int z1=0;// count zero;
        int z2=0;
        long sum1=0;
        long sum2=0;
        for(int i:nums1){
            if(i==0)z1++; //2
            sum1+=i;//6
        }
        for(int i:nums2){
            if(i==0)z2++;//1 
            sum2+=i;//11
        }
        long min1=sum1+z1; // get minimum sum;
        long min2=sum2+z2;// get sum + zeroes;
         //now get sum;
         if(z1==0 && z2==0) //if both has no zeroes;
         return sum1==sum2?sum1:-1;

         else if(z1==0){ // because if one array contains zeroes then max sum can 
         //reach sum of other
            return min2<=sum1?sum1:-1; // agar chota hua tabhi max sum ja skta h vo;
         }

         else if(z2==0){ // because if one array contains zeroes then max sum can 
         //     min1=2+0+2+0= 6 includes zero  6<= always less than sum1;
            return min1<=sum2?sum2:-1; 
         }

           return Math.max(min1,min2);

    }
}