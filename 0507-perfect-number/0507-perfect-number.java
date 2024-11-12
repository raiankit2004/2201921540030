class Solution {
    public boolean checkPerfectNumber(int num) {
        int count=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
            count=count+i;
        }
        }
        if(count==num){
            return true;
        }
        return false;
    }
}