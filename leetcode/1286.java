class CombinationIterator {
    String characters;
    int combinationLength;
    List<String> combinations;
    int currentIndex;

    public CombinationIterator(String characters, int combinationLength) {
        this.characters = characters;
        this.combinationLength = combinationLength;
        this.combinations = new ArrayList<>();
        this.currentIndex = 0;
        makeCombinations(0, new StringBuilder());
    }

    private void makeCombinations(int start, StringBuilder sb) {
        if(sb.length() == combinationLength) {
            combinations.add(sb.toString());
            return;
        }
        for(int i = start; i < characters.length(); i++) {
            sb.append(characters.charAt(i));
            makeCombinations(i+1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public String next() {
        return combinations.get(currentIndex++);
    }

    public boolean hasNext() {
        return currentIndex < combinations.size();
    }
}