class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Key: Number, Value: Index
        HashMap<Integer, Integer> seen = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int dif = target - nums[i];

            if(seen.containsKey(dif)){
                return new int[]{i, seen.get(dif)};
            }

            seen.put(nums[i], i);
        }

        return new int[]{};
    }
}
