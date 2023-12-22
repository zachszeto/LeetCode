class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(i == 0 || (i >0 && nums[i] != nums[i-1])){
                int target = 0 - nums[i];
                int low = i + 1;
                int high = nums.length - 1;

                while(low < high){
                    ArrayList<Integer> temp = new ArrayList<>();
                    if(nums[low] + nums[high] == target){
                        temp.add(nums[low]);
                        temp.add(nums[high]);
                        temp.add(nums[i]);
                        result.add(temp);

                        while(low < high && nums[low] == nums[low + 1]) low++;
                        while(low < high && nums[high] == nums[high - 1]) high--;
                        
                        low++;
                        high--;
                    } else if(nums[low] + nums[high] < target){
                        low++;
                    } else {
                        high--;
                    } 
                }
            }
        }
        return result;
    }
}
