class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        int n=hours.length;
        for(int i=0;i<n;i++){
            if(hours[i]>=target){
                count++;
            }
        }
        return count;
    }
}