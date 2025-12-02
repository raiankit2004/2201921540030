class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] freq = new int[26]; // freq={0,0,0,0,0,0....}

        // count characters in magazine
        for (char c : magazine.toCharArray()) {  // a,a,b
            freq[c - 'a']++;// freq['a'-'a']++ so freq[0]=1 , freq[0]=2 and freq[1]=1;
        }

        // check characters in ransomNote
        for (char c : ransomNote.toCharArray()) {//a,a
            if (freq[c - 'a'] == 0) { //freq['a'-'a'] so freq[0]!=0 it is 2 then 1
                return false;
            }
            freq[c - 'a']--; // freq[0]=1 and freq[0]=0;
        }

        return true;
    }
}
