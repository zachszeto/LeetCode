//Thinking
//Iterate through the array with nested for-loops to see if any two numbers add up to the target. If so return their indices.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // If no two elements sum up to the target, return an empty array or throw an exception
        return new int[0];
    }
}