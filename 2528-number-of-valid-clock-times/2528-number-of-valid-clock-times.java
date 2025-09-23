class Solution {
    public int countTime(String time) {
        char[] arr=time.toCharArray();
        int res=1;
        if(arr[0]=='?' && arr[1]=='?')res*=24;
        //In Java, characters like '0', '1', … '9' have ASCII/Unicode numeric values.
        //'0' → 48 '1' → 49
        //To convert a character digit into an actual integer, we subtract '0':
        else if(arr[0]=='?'){
           res*= (arr[1]-'0'>=4)?2:3;
        }
        else if(arr[1]=='?'){
           res*= (arr[0]-'0'<=1)?10:4;
        }
        if(arr[3]=='?')
        res*=6;
        if(arr[4]=='?')
        res*=10;
         
         return res;
    }
}