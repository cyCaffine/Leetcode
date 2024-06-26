class Solution {
    public int strStr(String haystack, String needle) {

    
       if (haystack == null || needle == null) {
            return -1;
        }
        
        int hLen = haystack.length();
        int nLen = needle.length();
        
        // Iterate through haystack
        for (int i = 0; i <= hLen - nLen; i++) {
            // Check if needle matches substring of haystack starting at index i
            if (haystack.substring(i, i + nLen).equals(needle)) {
                return i; // Found the first occurrence, return index i
            }
        }
        
        return -1; // Needle not found in haystack
    }
}