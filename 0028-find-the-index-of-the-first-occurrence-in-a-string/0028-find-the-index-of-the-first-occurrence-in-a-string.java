class Solution {
    public int strStr(String haystack, String needle) {

    
       if (haystack == null || needle == null) {
            return -1;
        }
        
        int M = haystack.length();
        int N = needle.length();
        
        // Iterate through haystack
        for (int i = 0; i <= M - N; i++) {
            // Check if needle matches substring of haystack starting at index i
            if (haystack.substring(i, i +  N).equals(needle)) {
                return i; // Found the first occurrence, return index i
            }
        }
        
        return -1; // Needle not found in haystack
    }
}