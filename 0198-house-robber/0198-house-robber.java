class Solution {
    public int rob(int[] nums) {
//   public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int prev2 = 0;    // Max money robbed up to the house before the previous one
        int prev1 = nums[0]; // Max money robbed up to the previous house

        for (int i = 1; i < n; i++) {
            int include = prev2 + nums[i]; // Rob current house
            int exclude = prev1;           // Skip current house

            int current = Math.max(include, exclude);
            prev2 = prev1; // Update for the next iteration
            prev1 = current;
        }

        return prev1; // The answer is the maximum money robbed up to the last house
    }
}