class Solution {
    public int findContentChildren(int[] g, int[] s) {
      Arrays.sort(g); // Sort child greed factors
        Arrays.sort(s); // Sort cookie sizes
        
        int contentChildren = 0; // Initialize content children count
        int gIndex = 0; // Initialize index for child greed factors
        int sIndex = 0; // Initialize index for cookie sizes
        
        // Iterate through both arrays
        while (gIndex < g.length && sIndex < s.length) {
            // If current cookie size is enough for current child's greed factor
            if (s[sIndex] >= g[gIndex]) {
                contentChildren++; // Increment content children count
                gIndex++; // Move to the next child
            }
            sIndex++; // Move to the next cookie size
        }
        
        return contentChildren; // Return the maximum number of content children
    }
    }