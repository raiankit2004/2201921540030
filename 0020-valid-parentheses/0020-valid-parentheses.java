class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        if(n%2!=0){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='('|| ch=='{'|| ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
               return false;
                }
                char top = st.peek();
              if(ch==')' && top!='('){
               return false;
                }
                else if(ch=='}' && top!='{'){
               return false;
                }
                else if(ch==']' && top!='['){
               return false;
                }
                else{
                    st.pop();
                }
            }
        }
        return st.size()==0;
    }
}