class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        // Create rows with all elements initialized to 1
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add(1);
            }
            ans.add(row);
        }
        // Fill the inner values
        for (int i = 2; i < numRows; i++) {
            for (int j = 1; j < i; j++) {
                int value = ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j);
                ans.get(i).set(j, value);
            }
        }
        return ans;
    }
}