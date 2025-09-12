class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
         int beg=0;
         int end=n-1;
         while(beg<end){
            int mid=beg+(end-beg)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }
            else{
                beg=mid+1;
            }
         }
         return beg;
    }
}