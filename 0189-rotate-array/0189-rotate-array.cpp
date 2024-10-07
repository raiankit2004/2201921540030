class Solution {
public:
    void reverse(std::vector<int>& nums, int i, int j) {
        while (i < j) {
            std::swap(nums[i], nums[j]);
            i++;
            j--;
        }
    }
    void rotate(vector<int>& nums, int k) {
         int n = nums.size();
        // Ensure k is within the bounds of the array length
        k = k % n;
        if (k == 0) return; // No need to rotate if k is 0

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);
        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Step 3: Reverse the remaining n-k elements
        reverse(nums, k, n - 1);
    }
};