class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
            digits[i]++;
            return digits;
            }
            digits[i]=0;
        } if(digits[0]==0){
        int newno[]=new int[digits.length+1];
        newno[0]=1;
        return newno;}
        return digits;
    }
}