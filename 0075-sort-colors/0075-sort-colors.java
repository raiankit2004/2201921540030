class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int ans1[]=new int[n];
        int ans2[]=new int[n];
        int ans3[]=new int[n];
        int j=0,k=0,l=0,index=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
               ans1[j++]=nums[i]; 
            }
            else if(nums[i]==1){
                ans2[k++]=nums[i];
            }
            else{
                ans3[l++]=nums[i];
            }
        }
         for(int a=0;a<j;a++)nums[index++]=ans1[a];
         for(int a=0;a<k;a++)nums[index++]=ans2[a];
         for(int a=0;a<l;a++)nums[index++]=ans3[a];
     }
}