class Solution {
    public boolean kLengthApart(int[] nums, int k) {
       int n=nums.length;
       int last=-1;// if this is not first one 
          for(int i=0;i<n;i++){
        if(nums[i]==1){// nums[0]=1;nums[3]=1;
               if(last!=-1 && i-last-1 < k){// if first 1 found skip gap check
                  return false;
               }
               last=i; // last=0;
             
            }
        } 
        return true;
    }
}