class Solution {
    public String[] findRelativeRanks(int[] score) {


      int n = score.length;
        String[] result = new String[n];
        HashMap<Integer, Integer> scoreToIndex = new HashMap<>();

        // Store the original score-index mapping
        for (int i = 0; i < n; i++) {
            scoreToIndex.put(score[i], i);
        }

        // Sort the scores in descending order
        Arrays.sort(score);
        for (int i = 0; i < n / 2; i++) {
            int temp = score[i];
            score[i] = score[n - i - 1];
            score[n - i - 1] = temp;
        }

        // Assign ranks to each athlete
        for (int i = 0; i < n; i++) {
            int originalIndex = scoreToIndex.get(score[i]);
            if (i == 0) {
                result[originalIndex] = "Gold Medal";
            } else if (i == 1) {
                result[originalIndex] = "Silver Medal";
            } else if (i == 2) {
                result[originalIndex] = "Bronze Medal";
            } else {
                result[originalIndex] = String.valueOf(i + 1);
            }
        }

        return result;
    }
    
    
}