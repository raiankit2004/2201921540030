import java.util.*;
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length*grid.length;
        int arr[] = new int[n];
        int ans[] = new int[2];
        int k=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                arr[k] = grid[i][j];
                k++;
            }
        }
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                ans[0] = arr[i];
                arr[i] = 0;
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
        }
        ans[1] = (n*(n+1))/2 - sum;
        return ans;
    }
}