class Solution {
    public int alternateDigitSum(int n) {
        int sign=1;
        int sum=0;
        while(n>0){
            int r=n%10;
            sign=sign*-1;
            sum=sum+sign*r;
            n=n/10;
        }
        return sign*sum;
    }
}