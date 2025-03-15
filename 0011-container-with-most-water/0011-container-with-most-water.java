import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
         int maxarea=0;
         int left=0;
         int right=n-1;
         while(left<right){
            int width=right-left;  //8-1=7;
            int minheight=Math.min(height[left],height[right]);// (8,7)=7;
            int currentarea=width*minheight;// 7*7=49;
            maxarea=Math.max(currentarea,maxarea);
            if(height[left]<height[right])left++;
            else{
                right--;
            }
          }
          return maxarea;
     }
}