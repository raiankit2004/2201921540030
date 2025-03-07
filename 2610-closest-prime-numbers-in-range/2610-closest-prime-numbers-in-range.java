class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] result = {-1, -1};
        List<Integer> primes = new ArrayList<>();
        boolean[] isPrime = new boolean[right + 1];
        Arrays.fill(isPrime, true);
        for (int num = 2; num * (long) num <= right; num++) {
            if (isPrime[num]) {
                for (long multiple = (long) num * num; multiple <= right; multiple += num) {
                    isPrime[(int) multiple] = false;
                }
            }
        }
        for(int i=Math.max(left, 2); i<=right;i++){
            if(isPrime[i]){
                primes.add(i);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=primes.size()-1;i>0;i--){
            if(primes.get(i) - primes.get(i-1) <= min){
                min = primes.get(i) - primes.get(i-1);
                result[1] = primes.get(i);
                result[0] = primes.get(i-1);
            }
        }
        return result;
    }
}