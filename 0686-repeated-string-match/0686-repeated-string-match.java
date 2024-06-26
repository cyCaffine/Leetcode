class Solution {
    public int repeatedStringMatch(String a, String b) {
     StringBuilder repeatedA = new StringBuilder(a);
        int repeatCount = 1;

        // Keep repeating 'a' until the length of repeatedA is at least the length of 'b'
        while (repeatedA.length() < b.length()) {
            repeatedA.append(a);
            repeatCount++;
        }

        // Check if 'b' is a substring of repeatedA
        if (repeatedA.indexOf(b) != -1) {
            return repeatCount;
        }

        // If 'b' is not found, append 'a' one more time and check again
        repeatedA.append(a);
        repeatCount++;

        // Check again if 'b' is a substring of the newly appended repeatedA
        if (repeatedA.indexOf(b) != -1) {
            return repeatCount;
        }

        // If 'b' is still not found, return -1
        return -1;
    }
}
