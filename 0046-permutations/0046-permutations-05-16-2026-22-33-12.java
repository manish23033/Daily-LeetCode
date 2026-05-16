class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        backtrack(nums, new ArrayList<>(), result);
        
        return result;
    }

    private void backtrack(int[] nums, List<Integer> temp, List<List<Integer>> result) {
        
        // Base Case
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        // Try every number
        for (int num : nums) {
            
            // Skip if already used
            if (temp.contains(num))
                continue;

            // Choose
            temp.add(num);

            // Explore
            backtrack(nums, temp, result);

            // Backtrack
            temp.remove(temp.size() - 1);
        }
    }
}