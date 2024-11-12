class Solution {
    private boolean self(int n){
        int num=n;
        while(num>0){
            int rem=num%10;
            num=num/10;
            if(rem==0 || n%rem!=0){
                return false;
            }
        }
            return true; 
    }
    public List<Integer> selfDividingNumbers(int left, int right){
        List<Integer> res = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(self(i)==true){
                res.add(i);     
            }
        }
        return res;
    }
}