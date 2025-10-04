class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int res=0;
        for(int i:nums){
            if(i%2==0){
                list.add(i);
            }
        }
          for(int i=0;i<list.size();i++){
            res=res|list.get(i);
          }
          return res;
    }
}