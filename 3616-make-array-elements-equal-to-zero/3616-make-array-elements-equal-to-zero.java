class Solution {
    public int countValidSelections(int[] nums) {
        int total=0,left=0,curr=0;
        for(int num:nums){
            total+=num; // total=6;
        }
        for(int num:nums){
            int right=total-left-num; // right=6-0-1=5
            if(num==0){
             if(right==left){
               curr+=2;  
             }
             else if(left==right-1 || left-1==right){ // right-- when in left
                curr+=1;
             }
            }
            left+=num;
        }
        return curr;
    }
}