import java.util.ArrayList;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> lib = new ArrayList<>();
        int max = 0;
        

        for(int i = 1; i < s.length(); i++){
           if(s.length() == 1){
               return 1;
           }
           else if(!lib.contains(s.charAt(i))) {
               lib.add(s.charAt(i));
               max+=1;
           }
       }
       return max;
    }
}