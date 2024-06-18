class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums1) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> resultList = new ArrayList<>();
        for (int num : nums2) {
            if (freqMap.containsKey(num) && freqMap.get(num) > 0) {
                resultList.add(num);
                freqMap.put(num, freqMap.get(num) - 1);
            }
        }

        int[] result = new int[resultList.size()];
        int index = 0;
        for (int num : resultList) {
            result[index++] = num;
        }

        return result;
    }
 
    }
