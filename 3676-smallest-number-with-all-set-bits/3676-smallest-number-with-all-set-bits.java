import java.util.*;
class Solution {
    public int smallestNumber(int n) {
        int res=0;
        for(int i=0;i<100;i++){
            int x=(int)(Math.pow(2,i)-1);
            if(x>=n){
                res=x;
                break;
            }
        }
        return res;
    }
}