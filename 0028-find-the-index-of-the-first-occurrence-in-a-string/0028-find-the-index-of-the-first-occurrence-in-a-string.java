class Solution {
    public int strStr(String haystack, String needle){
        if(needle.length()==0) return 0;
        int count = 0;
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(count)){
                count++;
            }
             else if(haystack.charAt(i)!=needle.charAt(count)){
                 i-=count;
                 count=0;
             }
            if(count==needle.length())
                return i-=count-1;            
    }
        return -1;
  }
}