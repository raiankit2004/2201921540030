class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n=arr.length;
        int count=0;
        for(int i:arr){
            if(i%2!=0){
                count++;
                if(count==3){
                    return true;
                }
            }
            else{
               count=0; 
            }
        }
        return false;
    }
}