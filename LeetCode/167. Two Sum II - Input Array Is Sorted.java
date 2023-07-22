//Thinking
//Create a head and tail pointer that represent the indices of a given number. Then move those pointers accordingly based on where the sum of those two numbers are relative to the target. Probably could try and implement a binary search algorthim in the future to increase the programs efficiency.
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int headIndex = 0;
        int tailIndex = numbers.length - 1;

        while(headIndex <= tailIndex){
            //Check if we found the combination
            if (numbers[headIndex] + numbers[tailIndex] == target) {
                int[] indexes = {headIndex + 1, tailIndex + 1};
                return indexes;
            }

            if (numbers[headIndex] + numbers[tailIndex] < target) {
                headIndex++;
            }

            if (numbers[headIndex] + numbers[tailIndex] > target) {
                tailIndex--;
            }
        }
        return null;
    }
}