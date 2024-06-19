class Solution {

    public String countAndSay(int n) {
  // Base case: the first element of the sequence is "1"
        if (n == 1) {
            return "1";
        }

        // Recursively get the previous term in the sequence
        String previousTerm = countAndSay(n - 1);

           // StringBuilder to build the current term
        StringBuilder currentTerm = new StringBuilder();

 // Variables to keep track of the current character and its count
        int count = 1;
        char currentChar = previousTerm.charAt(0);

 // Iterate through the previous term starting from the second character
        for (int i = 1; i < previousTerm.length(); i++) {
            if (previousTerm.charAt(i) == currentChar) {
                // If the character is the same as the current character, increment the count
                count++;
            } else {
                // If the character is different, append the count and the character to the current term
                currentTerm.append(count).append(currentChar);
                // Reset the count to 1 and update the current character
                count = 1;
                currentChar = previousTerm.charAt(i);
            }
        }

 // Append the last group of characters
        currentTerm.append(count).append(currentChar);

        return currentTerm.toString();
    }
      
        
    }
