class Solution {
    public int longestConsecutive(int[] nums) {
        //Edge Case
       if(nums.length == 0) return 0;

        //Add to Hashset
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        //Keeps track of overall max and current max
        int longest = 0;

        for(int num : set){
            if(!set.contains(num-1)){
                int count = 1;
                while(set.contains(num + 1)){
                    num++;
                    count++;
                }
                longest = Math.max(longest, count);

                if(longest > nums.length/2) break;
            }
        }
        return longest;
    }
}
