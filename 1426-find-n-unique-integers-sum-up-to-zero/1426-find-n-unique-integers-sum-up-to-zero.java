class Solution {
    public int[] sumZero(int n) {
        int[]arr=new int[n];
        int l=0;
        for(int i=1;i<=n/2;i++){
            arr[l++]=i;
            arr[l++]=-i;
        }
        if(n%2==1) 
        arr[l]=0;
        return arr;
    }
}