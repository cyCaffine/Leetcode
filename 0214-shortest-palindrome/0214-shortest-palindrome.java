class Solution {
    public String shortestPalindrome(String s) {
     int n = s.length();
        if (n <= 1) return s;

        // Find the longest palindrome suffix in s
        int i = n - 1;
        while (i >= 0) {
            if (isPalindrome(s, 0, i)) {
                break;
            }
            i--;
        }

        // Build the result by appending the non-palindromic prefix of reversed s to s
        StringBuilder sb = new StringBuilder(s);
        String suffix = sb.substring(i + 1);
        return new StringBuilder(suffix).reverse().append(s).toString();
    }

    // Helper function to check if a substring s[start...end] is a palindrome
    private static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
