class Solution {
    public int lengthOfLongestSubstring(String s) {
        // set to store the unique character in the current window
        Set<Character> set = new HashSet<>();

        // pointer for the sliding window
        int left = 0; int maxLength  = 0;
        // loop through the string with right pointer
        for(int right = 0; right < s.length(); right++){
            // if the character at right pointer is already in the set
            while(set.contains(s.charAt(right))){
                // remove the character at the left pointer from the set
                set.remove(s.charAt(left));
                left++;
            }
            // add the character at right pointer to the set
            set.add(s.charAt(right));
             // Update the maximum length of substring found so far
               maxLength = Math.max(maxLength, right - left + 1);
        }

    
    return maxLength;
    }
}