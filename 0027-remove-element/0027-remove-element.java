class Solution {
    public int removeElement(int[] nums, int val) {

        HashMap<Integer, Boolean> map = new HashMap<>();
         int index = 0;
        for(int num : nums){
            if(num != val){
                map.put(num, true);
            }
        }
        for(int num : nums){
            if(map.containsKey(num)){
                nums[index] = num;
                index++;
            }

        }
        return index;
        
    }
}