class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
         int rowbegin=0;
        int rowend=n-1;
        int colsbegin=0;
        int colsend=n-1;
        int val=1;
        while(rowbegin<=rowend && colsbegin<=colsend){
           //right order
            for(int j=colsbegin;j<=colsend;j++){
               (matrix[rowbegin][j])=val;
                val+=1;
            }
                rowbegin++;
            for(int j=rowbegin;j<=rowend;j++){
                (matrix[j][colsend])=val;
                 val+=1;
            }
                colsend--;
            if(rowbegin<=rowend){
            for(int j=colsend;j>=colsbegin;j--){
                (matrix[rowend][j])=val;
                 val+=1;
            }
                rowend--;
        }
            if(colsbegin<=colsend){
            for(int j=rowend;j>=rowbegin;j--){
                (matrix[j][colsbegin])=val;
                 val+=1;
            }
                colsbegin++; 
            }
        }
        return matrix;
    }
}