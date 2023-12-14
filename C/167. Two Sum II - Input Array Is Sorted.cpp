class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        int high = numbers.size() - 1;
        int low = 0;

        while(low<=high){
            int sum = numbers[low] + numbers[high];

            if(sum < target){
                low++;
            } else if(sum > target){
                high--;
            }else{
                return {low + 1, high + 1};
            }
        }
        return {};
    }
};
