class Solution {
    public int countNegatives(int[][] grid) {
        int m=grid.length;   //m=4
        int n=grid[0].length;//n=4
        int row=0;  // row=0
        int cols=n-1; //cols=0;
        int count=0;
           while(row<m && cols>=0){ //  row<4 and cols<4

            if(grid[row][cols]>=0) //grid[0][3] all positive in left
                 row++;   
                 
                 else{             
            count+= m-row;     // 4-0=4;
            cols--;             // check for 2 3 negative in same row
            }
                
        }
        return count;
    }
}