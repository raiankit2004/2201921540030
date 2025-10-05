class Solution {
    public char findTheDifference(String s, String t) {
        char ans=0;

        // use xor which cancels the matching letters from t
        for(char ch:s.toCharArray()) ans^=ch;// ans=(0^a^b^c^d)
        for(char ch:t.toCharArray()) ans^=ch;// ans=(0^a^b^c^d)^a^b^c^d^e;
             return ans;
    }
}