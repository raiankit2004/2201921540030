class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int beg=0;
        int end=n-1;
        while(beg<=end){
            int mid=beg+(end-beg)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                beg=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return beg;
    }
}