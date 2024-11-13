import java.lang.Math;
class Solution {
    public int reverse(int x) {
        int num=x;
        int rev=0;
        int r;
       while(num!=0){
           r=num%10;
           num=num/10;
           if(rev>0 && rev >(Integer.MAX_VALUE-r)/10 || rev<0 && rev < (Integer.MIN_VALUE-r)/10) return 0;
           rev=rev*10+r;
       }
        return rev;
    }
}