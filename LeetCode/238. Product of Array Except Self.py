class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        length = len(nums)
        result = [1] * len(nums)
        pre = 1
        post = 1

        for i in range(length):
            result[i] *= pre
            pre = pre*nums[i]
            result[length-i-1] *= post
            post = post*nums[length-i-1]
        
        return result