class Solution {
    public List<String> generateParenthesis(int n) {
      List<String> list=new ArrayList<>();
      dfs(0,0,"",n,list);
      return list;
    } 
    public void dfs(int open,int close,String s,int n,List<String> list){
       if(open==close && open+close==n*2){
         list.add(s);
         return;
       }
       if(open<n)
       dfs(open+1,close,s+"(",n,list);
       if(close<open)
       dfs(open,close+1,s+")",n,list);


    }
      
}