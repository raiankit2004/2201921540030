class Solution {
    public boolean wordPattern(String pattern, String s) {
        String ch[]=s.split(" ");
        Map<Character,String> h=new HashMap<>();
        Set<Character> s1=new TreeSet<>();
        Set<String> s2=new TreeSet<>();
        if(ch.length!=pattern.length()) return false;
        for(int i=0;i<ch.length;i++){
        s1.add(pattern.charAt(i));
        s2.add(ch[i]);
         if(h.containsKey(pattern.charAt(i)) && !(h.get(pattern.charAt(i)).equals(ch[i]))) return false;  
         else h.put(pattern.charAt(i),ch[i]);
        }
        if(s1.size()!=s2.size()) return false;
        return true;
    }
}