class Solution {
    public int minAddToMakeValid(String s) {
      
    // Initialize a stack to keep track of characters
    Stack<Character> stack = new Stack<>();

    // Iterate over each character in the string
    for (char ch : s.toCharArray()) {
        // If the current character is a closing parenthesis
        if (ch == ')') {
            // Check if the stack is not empty and the top of the stack is an opening parenthesis
            if (!stack.isEmpty() && stack.peek() == '(') {
                // If so, pop the top of the stack (which is the matching opening parenthesis)
                stack.pop();
            } else {
                // If not, push the closing parenthesis onto the stack
                stack.push(ch);
            }
        } else {
            // If the current character is an opening parenthesis, push it onto the stack
            stack.push(ch);
        }
    }

    // The size of the stack represents the number of unmatched parentheses
    return stack.size();
}

}