class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Key: Number, Value: Count
        HashMap<Integer, Integer> count = new HashMap<>();

        //Add elements from nums to HashMap
        for(int i = 0; i < nums.length; i++){
            count.merge(nums[i], 1, Integer::sum);
        }

        //Convert array to ArrayList based on values, then reverse so descending order, then split based on k
        ArrayList<Integer> list = new ArrayList<>(count.values());
        Collections.sort(list, Collections.reverseOrder());
        ArrayList<Integer> list2 = new ArrayList<>(list.subList(0,k));

        int[] result = new int[list2.size()];
        int j = 0;

        //For each key/Value pair
        for(var entry : count.entrySet()){
            if(list2.contains(entry.getValue())){
                result[j++] = entry.getKey();
            }
        }

        return result;
    }
}
