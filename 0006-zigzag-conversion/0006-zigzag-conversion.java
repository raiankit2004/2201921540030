class Solution {
    public String convert(String s, int numRows) {
         if (numRows == 1 || s.length() <= numRows) return s;
        int row=0;
        int right=0;
        boolean goingdown=true;
        char m[][]=new char[numRows][s.length()];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            m[row][right]=s.charAt(i);
            if(goingdown){
                if(row==numRows-1){
                    goingdown=false;
                    row--;
                    right++;
                }
                else{
                    row++;
                }
            }
            else{
                if(row==0){
                goingdown=true;
                row++;
                }
                else{
                    row--;
                    right++;
                } 
            }
        }
            for (int k = 0; k < numRows; k++) {
            for (int j = 0; j <= right; j++) {
                if (m[k][j] != '\0') {//if cell is not empty then append;
                    sb.append(m[k][j]);
                }
            }
        }
            return sb.toString();
    }
}
