class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       String[] result; 
        for(String s : strs){
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);
            Arrays.toString(sArray);
        }

    }
}