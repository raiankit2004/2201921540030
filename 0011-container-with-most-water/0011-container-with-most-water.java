import java.util.*;
class Solution {
    public int maxArea(int[] height) {
       int n=height.length;
       int left=0;
       int right=n-1;// last index;
       int res=0;
        while(left<right){
            int width=right-left; //n-1-0 = 8;
           int h=Math.min(height[left],height[right]); // min(1,7 ) =3;
            int area=h*width;
            res=Math.max(area,res);

            //since 1<7 so left++ ;
            if (height[left] < height[right])
                left++;
            else
                right--;

        }
        return res;
    }
}