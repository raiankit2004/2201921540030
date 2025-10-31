class Solution {
    public String answerString(String word, int numFriends) {
        if (numFriends == 1) return word;
        String res="";
        int len=word.length()-numFriends+1; //4-2+1=3
        for(int i=0;i<word.length();i++){
            String temp;
        if(i+len<=word.length()) // 3<4
           temp=word.substring(i,i+len);  // temp=word(0,3) ,, dbc
        else{
            temp=word.substring(i);// d
        }
        if(temp.compareTo(res)>0)
        res=temp;
        }
        return res;
        }
}

