public class NestedIterator implements Iterator<Integer> {
    List<Integer> nums = new ArrayList<>();
    int now;

    public NestedIterator(List<NestedInteger> nestedList) {
        flattenList(nestedList);
        now = 0;
    }

    private void flattenList(List<NestedInteger> nestedList) {
        for (NestedInteger ni : nestedList) {
            if (ni.isInteger()) {
                nums.add(ni.getInteger());
            } else {
                flattenList(ni.getList());
            }
        }
    }

    @Override
    public Integer next() {
        return nums.get(now++);
    }

    @Override
    public boolean hasNext() {
        if(now >= nums.size()) {
            return false;
        } else {
            return true;
        }
    }
}