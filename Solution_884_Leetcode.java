class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
         String[] words1 = s1.split(" "); // Split the first sentence into words
        String[] words2 = s2.split(" "); // Split the second sentence into words
        
        HashMap<String, Integer> map = new HashMap<>();
        
      
        for (String word : words1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Count occurrences of words from s2
        for (String word : words2) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Collect words that appear exactly once
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }

        return result.toArray(new String[0]); // Convert list to array
    }
}
