class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high = Arrays.stream(piles).max().getAsInt();
        int low = 1;

        while(low <= high){
            int mid = low + (high-low) / 2;

            if(canEatAll(piles, h, mid)){
                high = mid-1;
            } else {
                low = mid + 1;
            }

        }
        return low;
    }

    public boolean canEatAll(int[] piles, int h, int k){
        int count = 0;

        for(int pile : piles){
            int currHours = pile % k;
            if (pile % k == 0) {
                currHours = pile / k;
            } else {
                currHours = pile / k + 1;
            }
            count+= currHours;
            if(count>h){
                return false;
            }
        }
        return true;
    }
}