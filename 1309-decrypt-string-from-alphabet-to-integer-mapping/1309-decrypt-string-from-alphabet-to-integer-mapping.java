class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i+2<s.length() && s.charAt(i+2)=='#'){ // i+2=#
               int num=Integer.parseInt(s.substring(i,i+2));// '10'->10
               sb.append((char)('a'+num-1));  // 'a'+9 ='j'
               i=i+2;
            }
            else{
                //if i+2!=#
                int num=s.charAt(i)-'0';
                sb.append((char)('a'+num-1));
            }
        }
        return sb.toString();
    }
}