import java.lang.Math;
class Solution {
    static int win(int nums[],int i,int j){
        if(i==j){
            return nums[i];
        }
        if(i>j){
            return 1;
        }
        int p1= nums[i]-win(nums,i+1,j);
        int p2 = nums[j]-win(nums,i,j-1);
        return Math.max(p1,p2);
    }
    public boolean predictTheWinner(int[] nums) {
        return win(nums,0,nums.length-1)>=0;
    }
}