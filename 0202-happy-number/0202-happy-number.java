class Solution {
    public boolean isHappy(int n) {
        boolean ans;
        while(true){
            int temp=n;
            int sum=0;
            while(temp>0){
                int r=temp%10;
                sum+=Math.pow(r,2);
                temp/=10;
            }
            n=sum;
            if(sum<9){
                if(sum==1 || sum==7){
                    ans=true;
                }
                else{
                    ans=false;
                }
                break;
            }
        }
        return ans;
    }
}