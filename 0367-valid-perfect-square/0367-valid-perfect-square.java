
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        int beg=1;
        int end=num/2;
        while(beg<=end){
            int mid= (beg+end)/2;
            long sq = (long)mid*mid;
            if(sq==num){
                return true;
            }
            else if(sq<num){
                beg=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
}