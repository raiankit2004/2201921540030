class Solution {
    private static int product(int n){
          int mul=1;
          while(n>0){
          int r=n%10;
           mul=mul*r;
           n=n/10; 
        }
        return mul;
    }
    public int smallestNumber(int n, int t) {
        for(int i=n; ;i++){
            if(product(i)%t==0){
            return i;
            }
        }
    }
}