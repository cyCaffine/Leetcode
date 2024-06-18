class Solution {
    public void moveZeroes(int[] nums) {
        int zeroPos = 0; // Position to place the next non-zero element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // If the current element is non-zero, move it to the zeroPos and increment zeroPos
                nums[zeroPos++] = nums[i];
            }
        }
        // Fill the remaining elements from zeroPos to the end with zeros
        while (zeroPos < nums.length) {
            nums[zeroPos++] = 0;
        }
    }
        
    }