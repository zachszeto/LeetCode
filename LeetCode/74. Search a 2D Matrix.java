//Thinking
//Approached with binary search algorithm setting a low, mid, and high point then moving the low/high points based on where the target is in relation to the mid point. In example 1, the low = 1, mid = 11, high = 60 and target = 3. Since the target < mid, we set the mid point as our new high point and recurse with the new points always checking to see if the mid = target which would mean we found the target or that low > high which would mean that the target isnt in our 2D matrix so we should return false. Returning back to example 1, we now have low = 1, mid = 5, high = 11, and the target = 3. Once again we find that the target < mid so repeat what we just did leaving us with low = 1, mid = 3, high = 5, and target = 3. Since mid = target that means we have found the target thus returning true.
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length; 
        
        int low = 0;
        int high = row * col - 1;

         while(low <= high){
            int midIndex;
            int midVal;
            int rowIndex;
            int colIndex;

            midIndex = low + (high - low) / 2;
            rowIndex = midIndex/col;
            colIndex = midIndex%col;
            midVal = matrix[rowIndex][colIndex];

            //Base Case
            if(midVal == target){
                return true;
            }  
            else if (target <= midVal){
               high = midIndex - 1;
            } else {
               low = midIndex + 1;
            }
        }  
         return false;
    }
}