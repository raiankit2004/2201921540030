class Solution {
    public String longestPalindrome(String s) {
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            int odd=sub(s,i,i);    //for comparing through center for i=0; "b" len=1;
            int even=sub(s,i,i+1);//for even i=0 "ba" not match len=0;
            //for i=1 even "bab"  left and right pointer at "a" b==b so len=3;
            int maxlen=Math.max(odd,even);
        
        if(maxlen>end-start){ // at i=1 maxlen=3 and end-start=0; update
           start=i- (maxlen-1)/2;
           end=i+maxlen/2;
        }
        }
        return s.substring(start,end+1);
    }
    public int sub(String s,int left,int right){ //for even at i=0 "ba"not match len=0;
         while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;  //pointer "aba" b as center b==b and left=0;
            right++; //right=2 and a==a match
         }
         return right-left-1; //len=2-0+1=3;
    }
}