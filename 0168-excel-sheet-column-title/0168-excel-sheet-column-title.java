class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
        while(columnNumber>0){ //28>0  //1>0
        columnNumber--;// 27 because it should be zero based //0
        int rem=columnNumber%26; // 27%26=1; //0%26=0;
        char ch= (char)(rem+'A'); // 1+65=66 into char='B'; // 0+'A'=65 into 'A'
        sb.append(ch);//'B','A';
        columnNumber/=26;//27/26=1;
        }
       return sb.reverse().toString(); //"BA" to "AB"
    }
}