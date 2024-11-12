class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(1,n,k,new ArrayList<>(),ans);
   return ans;     
    }
public void solve(int start,int n,int k,List<Integer> curr,List<List<Integer>> ans){
    if(k==0){
        ans.add(new ArrayList<>(curr));
        return;
    }
        if(n==0){
            return;
      }
        curr.add(n);
        solve(1,n-1,k-1,curr,ans);
        curr.remove(curr.size()-1);
        solve(1,n-1,k,curr,ans);
    }
}