class Solution {
    public boolean isTrionic(int[] nums) {

        int n = nums.length;
        if (n < 4) return false;

        int i = 0;

        // 1️⃣ strictly increasing
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == 0) return false;   // no first increase

        int p = i;

        // 2️⃣ strictly decreasing
        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }
        if (i == p) return false;   // no decrease

        int q = i;

        // 3️⃣ strictly increasing (must run at least once)
        int startThird = i;
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == startThird) return false; // no final increase

        return i == n - 1;
    }
}
