import java.util.PriorityQueue;

public class MinimumNumberOfOperationsToExceedThresholdValueII {
    public int minOperations(int[] nums, int k) {
        if ((nums == null) || (nums.length < 2)) {
            return 0;
        }

        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer((long) num);
        }

        int operations = 0;
        while ((minHeap.size() > 1) && (minHeap.peek() < k)) {
            Long lowestValue = minHeap.poll();
            Long secondLowestValue = minHeap.poll();
            minHeap.offer((lowestValue * 2) + secondLowestValue);
            ++operations;
        }

        return operations;
    }
}
