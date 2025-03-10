class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
       for(int i=0;i<n-1;i++){
        if(nums[i]==nums[i+1]){
            nums[i]=nums[i]*2;
            nums[i+1]=0;
            i++;
        }
    } int index=0;
         for(int i=0;i<n;i++){
      if(nums[i]!=0){
        int temp = nums[index];
        nums[index]=nums[i];
        nums[i]=temp;
        index++;
      }
    }
      return nums;
    }
}