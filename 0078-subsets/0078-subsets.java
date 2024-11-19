class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> list=new ArrayList<>();
        int n=(int)Math.pow(2,nums.length)-1;
        for(int i=0;i<=n;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if(((i>>j)&1)==1){
                    temp.add(nums[j]);
                }
            }
            list.add(temp);
        }
        return list;   
    }
}