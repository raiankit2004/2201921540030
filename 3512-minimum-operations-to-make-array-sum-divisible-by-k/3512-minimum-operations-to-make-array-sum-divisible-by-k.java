class Solution {
    public int minOperations(int[] nums, int k) {
      int count=0;
      int sum=0;
      int r=0;
      for(int i=0;i<nums.length;i++){
           sum+=nums[i];
        }  
        r=sum%k;
          if(r==0){
              return 0;
            }
      return r;
    }
}