class Solution {
    public String reverseStr(String s, int k) {
      char[] str = s.toCharArray() ;
      int n=str.length; 
      for(int i=0;i<n;i+=2*k){         // i=i+2*k , if k=2 , i=0+4=4;
        if(i+k-1 <n){              // 1<n for i=0 and k=2;
            reverse(i,i+k-1,str);     // suppose i=0,1 reverse
        }
        else{
            reverse(i,n-1,str);
        }
      }
        String ans=new String(str);
      return ans;
    }
      private void reverse(int i,int j,char[]str){
        while(i<j){
            char temp = str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
      }
}