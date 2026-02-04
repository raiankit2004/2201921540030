class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb=new StringBuilder();
        String res="";
        for(int i=0;i<k;i++){
         sb.append(s.charAt(i)); 
        }
         sb.reverse();
        res=sb.toString()+s.substring(k);
        return res;
    }
}