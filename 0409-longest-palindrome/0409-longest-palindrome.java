class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for(char ch :s.toCharArray())
            count[ch]++;
         int res=0;
        for(int i=0;i<128;i++){
            int value=count[i];
            res=res+(value/2)*2;
            if(res%2==0 && value%2==1){
                res++;
            }
        }
      return res;  
    }
}