class Solution {
    public String largestOddNumber(String num) {

        int largestOddIndex = -1;
        for (int i = 0; i < num.length(); i++) {
            if ((num.charAt(i) - '0') % 2 != 0) {
                largestOddIndex = i;
            }
        }
        if (largestOddIndex == -1) {
            return "";
        } else {
            return num.substring(0, largestOddIndex + 1);
        }
    }
}