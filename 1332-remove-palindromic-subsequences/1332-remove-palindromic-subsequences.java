class Solution {
    public int removePalindromeSub(String s) {
        StringBuilder sb=new StringBuilder(s);
        String rev="";
        int count=0;
        rev=sb.reverse().toString();
        if(s.equals(rev)){
            count=1;
        }else{
            count=2;
        }
        return count;
    }
}