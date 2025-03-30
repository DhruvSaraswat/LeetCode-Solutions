import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if ((intervals == null) || (intervals.length == 0)) {
            return new int[0][0];
        }

        if (intervals.length == 1) {
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> mergedNonOverlappingIntervals = new ArrayList<>();
        int start = intervals[0][0], end = intervals[0][1], currStart = 0, currEnd = 0;

        for (int i = 1; i < intervals.length; ++i) {
            currStart = intervals[i][0];
            currEnd = intervals[i][1];
            if (currStart <= end) {
                end = Math.max(end, currEnd);
            } else {
                mergedNonOverlappingIntervals.add(new int[]{start, end});
                start = currStart;
                end = currEnd;
            }
        }
        mergedNonOverlappingIntervals.add(new int[]{start, end});

        final int[][] result = new int[mergedNonOverlappingIntervals.size()][2];
        for (int i = 0; i < mergedNonOverlappingIntervals.size(); ++i) {
            result[i][0] = mergedNonOverlappingIntervals.get(i)[0];
            result[i][1] = mergedNonOverlappingIntervals.get(i)[1];
        }

        return result;
    }
}