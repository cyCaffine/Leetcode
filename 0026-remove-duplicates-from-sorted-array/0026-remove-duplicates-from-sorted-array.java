class Solution {
  public int removeDuplicates(int[] nums) {
    
        if (nums.length == 0) {
            return 0;
        }

        HashMap<Integer, Boolean> uniqueElements = new HashMap<>();
        int index = 0;

        for (int num : nums) {
            if (!uniqueElements.containsKey(num)) {
                uniqueElements.put(num, true);
                nums[index] = num;
                index++;
            }
        }

        return index;
    }
}