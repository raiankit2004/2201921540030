import java.util.*;
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int arr[] = new int[n*n];
        int ans[] = new int[2];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[k] = grid[i][j];
                k++;
            }
        }
        Arrays.sort(arr);
        for(int i=0;i<n*n-1;i++){
            if(arr[i]==arr[i+1]){
                ans[0] = arr[i];
                arr[i] = 0;
            }
        }
        int sum=0;
        int m = n*n;
        for(int i=0;i<m;i++){
            sum = sum+arr[i];
        }
        ans[1] = (m*(m+1))/2 - sum;
        return ans;
    }
}