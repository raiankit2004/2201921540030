class Solution {
    public int maximumLength(String s) {
       Map<String,Integer> count = new HashMap<>();
        int substring=0;
        
        for(int start=0;start<s.length();start++){
             StringBuilder special = new StringBuilder();
            char ch = s.charAt(start);
            substring=0;
            for(int end=start;end<s.length();end++){
                if(end==start || s.charAt(start)==s.charAt(end)){
                    special.append(s.charAt(end));
                    count.put(special.toString(),count.getOrDefault(special.toString(),0)+1);
                }else{
                    break;
                }
            }
        }
        
        int max=-1;
        for(Map.Entry<String,Integer> entry :count.entrySet()){
            String sub=entry.getKey();
            int freq=entry.getValue();
            if(freq>=3){
                max=Math.max(max,sub.length());
            }
        }
        return max;
           
    }
} 