class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length; 
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { 
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; 
                }
            }
        }
        return new int[]{}; 
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;

        int[] result = twoSum(nums, target);

        // if (result.length == 2) {
        //     System.out.println("Indices: " + result[0] + ", " + result[1]);
        //     System.out.println("Numbers: " + nums[result[0]] + ", " + nums[result[1]]);
        // } else {
        //     System.out.println("No pair found.");
        // }
    }
}
