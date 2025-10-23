class Solution {
    public boolean hasSameDigits(String s) { 
         while (s.length() > 2) {
            s = sub(s);
        }
        // Check if both remaining digits are equal
        return s.charAt(0) == s.charAt(1);
       
    }

     public String sub(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<s.length();i++){
            int res=(s.charAt(i)-'0'+s.charAt(i-1)-'0')%10;  //292
            sb.append(res);  
        }
        return sb.toString();
    }
}