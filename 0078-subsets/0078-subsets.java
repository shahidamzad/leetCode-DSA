class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        backtrack(nums, 0, new ArrayList<>(), ans);

        return ans;
    }

    public void backtrack(int[] nums, int index,
                           List<Integer> current,
                           List<List<Integer>> ans) {

        // Every current list is a valid subset
        ans.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {

            // Take
            current.add(nums[i]);

            // Explore
            backtrack(nums, i + 1, current, ans);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}