class Solution {
    public boolean isAnagram(String s, String t) {
       int n1=s.length();
        int n2=t.length();
        if(n1!=n2)
            return false;
            int[] count = new int[26];
        for(char ch:s.toCharArray())
            count[ch-'a']++;
        for(char ch:t.toCharArray())
            count[ch-'a']--;
        
        for(int val:count)
            if(val!=0)
                return false;
        return true;
    }
}