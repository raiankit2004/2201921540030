import java.util.*;
class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        list.add(words[0]); // first word always store;
        
        for(int i=1;i<words.length;i++){
           String curr=words[i];  // curr="baba"
           String prev=words[i-1];// prev="abba"
          if(!isanagram(curr,prev)){
            list.add(curr);  // if not anagram add so "cd" not anagram
          }
        }
        return list;
    }

    public static boolean isanagram(String curr,String prev){
        if(curr.length()!=prev.length())return false;
        char[] ch1=curr.toCharArray();  // {'b','a','b','a'}
        char[] ch2=prev.toCharArray();  // {'a','b','b','a'}

        //now sort and compare;
        Arrays.sort(ch1); // sort and compare
        Arrays.sort(ch2);
        
       return Arrays.equals(ch1,ch2);
    }
}