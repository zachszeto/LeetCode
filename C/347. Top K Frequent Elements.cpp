class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        //Key: number, Value: count
        unordered_map<int, int> map;

        for(int i = 0; i < nums.size(); i++){
            map[nums[i]]++;
        }

        vector<int> result;

        for(int i = 0; i < k; i++){
            int max = 0;
            int maxKey;

            for(auto it = map.begin(); it != map.end(); it++){
                if(it->second > max){
                    max = it->second;
                    maxKey = it->first;
                }
            }
            map.erase(maxKey);
            result.push_back(maxKey);
        }

        return result;
    }
};
