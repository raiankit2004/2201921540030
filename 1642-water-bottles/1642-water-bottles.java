class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles; // sum=9
        while(numBottles>=numExchange){
              int newf=numBottles/numExchange;//9/3=3; new bottles // 3/3=1;
              sum+=newf; //9+3=12; // 12+1;
              numBottles=newf+(numBottles%numExchange); // numBottles=3+(9%3)=3;
              //3=1+3%3=1 ;   // 1<3 fails;

        }
        return sum;
    }
}