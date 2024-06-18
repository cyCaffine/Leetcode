class Solution {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        // Base case
        row.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            // Start from the end to avoid overwriting the values we need to calculate the current row
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            // Add 1 at the end for the current row
            row.add(1);
        }

        return row;
    }

    
}