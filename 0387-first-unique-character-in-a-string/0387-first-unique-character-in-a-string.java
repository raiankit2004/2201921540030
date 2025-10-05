class Solution {
    public int firstUniqChar(String s) {
       Map<Character,Integer> map=new HashMap<>();

       for(char ch:s.toCharArray()){    // l,e,e,t,c,o,d,e  in array ch;
            map.put(ch,map.getOrDefault(ch,0)+1) ; // l is put and map.getOrDefault gives 
         //count occurence of character l since its not present return 0 and count l=1;

       } 
          for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
          }
          return -1;
    }
}