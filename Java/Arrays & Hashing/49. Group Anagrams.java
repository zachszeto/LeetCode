class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Key: sorted word, Value: list of original words
        HashMap<String, List<String>> dict = new HashMap<>();

        for(String curr : strs){
            char[] word = curr.toCharArray();
            Arrays.sort(word);
            String sorted = new String(word);

            if(!dict.containsKey(sorted)){
                dict.put(sorted, new ArrayList<>());
            }

            dict.get(sorted).add(curr);
        }

       return new ArrayList<>(dict.values());
    }
}
