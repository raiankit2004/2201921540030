class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;

        // store smallest remainder-1 and remainder-2 numbers
        List<Integer> r1 = new ArrayList<>();
        List<Integer> r2 = new ArrayList<>();

        for (int n : nums) {
            sum += n;
            if (n % 3 == 1) r1.add(n);
            else if (n % 3 == 2) r2.add(n);
        }

        // sort to get smallest easily
        Collections.sort(r1);
        Collections.sort(r2);

        int remainder = sum % 3;

        if (remainder == 0) return sum;

        // if remainder 1 → remove smallest remainder-1 OR two remainder-2
        if (remainder == 1) {
            int remove1 = r1.size() > 0 ? r1.get(0) : Integer.MAX_VALUE;
            int remove2 = r2.size() > 1 ? r2.get(0) + r2.get(1) : Integer.MAX_VALUE;
            return sum - Math.min(remove1, remove2);
        }

        // if remainder 2 → remove smallest remainder-2 OR two remainder-1
        else { 
            int remove1 = r2.size() > 0 ? r2.get(0) : Integer.MAX_VALUE;
            int remove2 = r1.size() > 1 ? r1.get(0) + r1.get(1) : Integer.MAX_VALUE;
            return sum - Math.min(remove1, remove2);
        }
    }
}
