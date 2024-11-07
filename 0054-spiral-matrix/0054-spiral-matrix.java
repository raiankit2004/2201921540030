class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> result = new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int rowbegin=0;
        int rowend=n-1;
        int colsbegin=0;
        int colsend=m-1;
        while(rowbegin<=rowend && colsbegin<=colsend){
           //right order
            for(int j=colsbegin;j<=colsend;j++){
               result.add(matrix[rowbegin][j]);
            }
                rowbegin++;
            for(int j=rowbegin;j<=rowend;j++){
                result.add(matrix[j][colsend]);
            }
                colsend--;
            if(rowbegin<=rowend){
            for(int j=colsend;j>=colsbegin;j--){
                result.add(matrix[rowend][j]);
            }
                rowend--;
        }
            if(colsbegin<=colsend){
            for(int j=rowend;j>=rowbegin;j--){
                result.add(matrix[j][colsbegin]);
            }
                colsbegin++; 
            }
        }
        return result;
    }
}