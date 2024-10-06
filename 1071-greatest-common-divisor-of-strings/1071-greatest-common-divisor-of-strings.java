import java.lang.Math;
class Solution {
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public String gcdOfStrings(String str1, String str2) {
            int a=str1.length();
            int b=str2.length();
            int i=gcd(a,b);
            if((str1+str2).equals(str2+str1)){
                return str1.substring(0,i);
               }
               else{
                return "";
               }
            }
}