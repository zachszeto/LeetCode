class Solution {
    public boolean isAnagram(String s, String t) {
        //Key: letter, Value: count
        HashMap<Character, Integer> dictS = new HashMap<>();
        HashMap<Character, Integer> dictT = new HashMap<>();

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++){
            dictS.merge(s.charAt(i), 1, Integer::sum);
            dictT.merge(t.charAt(i), 1, Integer::sum);
        }

        return dictS.equals(dictT);
    }
}