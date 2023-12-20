class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            seen.add(nums[i]);
        }

        return nums.length != seen.size();
    }
}