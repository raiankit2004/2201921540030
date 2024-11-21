class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int[]arr = new int[2];
        arr[0]=arr[1]=-1;
        for(int i=0;i<n;i++){
            if(target==nums[i]){
              arr[0]=i;
                arr[1]=i;
                while((i+1)<n && nums[i+1]==target){
                    i++;
                    arr[1]=i;
                }
            }
        }
        return arr;
    }
}