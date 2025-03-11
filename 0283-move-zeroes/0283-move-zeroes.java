class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int index=0,k=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                int temp=nums[index];
                nums[index]=nums[i];
                nums[i]=temp;
                index++;
            }
        }
    }
}