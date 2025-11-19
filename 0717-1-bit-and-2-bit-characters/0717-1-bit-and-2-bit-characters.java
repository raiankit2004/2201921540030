class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n=bits.length;
        int i=0;
         while(i<n-1){
            if(bits[i]==1){//1,0,0
                i=i+2;
                } //i=2;
                else{
                    i=i+1;
                }
          
        }
          if(i==n-1)return true;
          
        return false;
    }
}