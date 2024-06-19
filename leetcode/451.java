class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        List<Character> characters = new ArrayList<>(frequencyMap.keySet());
        characters.sort((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));

        String answer = "";
        for (char c : characters) {
            int count = frequencyMap.get(c);
            for (int i = 0; i < count; i++) {
                answer += c;
            }
        }

        return answer;
    }
}