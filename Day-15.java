class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();

        // Add elements of head1 to a HashSet
        for (Integer num : head1) {
            set.add(num);
        }

        // Iterate through elements of head2
        for (Integer num : head2) {
            // Check if (x - num) exists in the HashSet
            if (set.contains(x - num)) {
                count++;
            }
        }

        return count;
    }
}
