class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int[] less = new int[n],
         high = new int[n], 
         result = new int[n];
         int j=0,count=0,k=0;
        for(int i=0;i<n;i++){
              if(nums[i]<pivot){
                less[j++]=nums[i];
              }
              else if(nums[i]==pivot)
              count++;
              else
              high[k++]=nums[i];
        }
            int index=0;
            for(int a = 0; a < j; a++) result[index++] = less[a];
            for(int a = 0; a < count; a++) result[index++] = pivot;
            for(int a = 0; a < k; a++) result[index++] = high[a];

         return result;
    }
}