class Solution {
    public String[] findWords(String[] words) {
          HashSet<Character> row1 = new HashSet<>();
        HashSet<Character> row2 = new HashSet<>();
        HashSet<Character> row3 = new HashSet<>();
        
        // Populate the rows with characters
        for (char c : "qwertyuiop".toCharArray()) {
            row1.add(c);
        }
        for (char c : "asdfghjkl".toCharArray()) {
            row2.add(c);
        }
        for (char c : "zxcvbnm".toCharArray()) {
            row3.add(c);
        }
        
        List<String> result = new ArrayList<>();
        
        // Check each word
        for (String word : words) {
            char[] chars = word.toLowerCase().toCharArray();
            HashSet<Character> row = null;
            boolean valid = true;
            
            // Determine which row the word belongs to
            if (row1.contains(chars[0])) {
                row = row1;
            } else if (row2.contains(chars[0])) {
                row = row2;
            } else if (row3.contains(chars[0])) {
                row = row3;
            }
            
            // Check if all characters are in the same row
            for (char c : chars) {
                if (!row.contains(c)) {
                    valid = false;
                    break;
                }
            }
            
            // Add valid words to the result list
            if (valid) {
                result.add(word);
            }
        }
        
        // Convert the result list to an array
        return result.toArray(new String[0]);
    }

}