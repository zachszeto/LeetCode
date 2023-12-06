class Solution {
    public int[] productExceptSelf(int[] nums) {
    
        //Product of Numbers to the left
        int[] left = new int[nums.length];
        int leftProd = 1;
        for (int i = 0; i < nums.length; i++) {
                left[i] = leftProd;
                leftProd *= nums[i];
        }

        //Product of Numbers to the right
        int[] right = new int[nums.length];
        int rightProd = 1; 
        for (int i = nums.length - 1; i >= 0; i--) {
                right[i] = rightProd;
                rightProd *= nums[i];
        }

        //Combining the two arrays
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[i] = right[i] * left[i];
        }

        return result;
    }
}
