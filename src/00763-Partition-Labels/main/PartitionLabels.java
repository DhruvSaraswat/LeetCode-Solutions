import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        if ((s == null) || (s.isEmpty())) {
            return new ArrayList<>();
        }

        if (s.length() == 1) {
            return Arrays.asList(1);
        }

        final int[][] indexOfFirstAndLastOccurrences = new int[26][2];
        for (int[] indices : indexOfFirstAndLastOccurrences) {
            indices[0] = -1;
            indices[1] = -1;
        }

        for (int i = 0; i < s.length(); ++i) {
            if (indexOfFirstAndLastOccurrences[s.charAt(i) - 'a'][0] == -1) {
                indexOfFirstAndLastOccurrences[s.charAt(i) - 'a'][0] = i;
            }
            indexOfFirstAndLastOccurrences[s.charAt(i) - 'a'][1] = i;
        }

        Arrays.sort(indexOfFirstAndLastOccurrences, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> mergedNonOverlappingIntervals = new ArrayList<>();
        int start = -1, end = -1, currStart = 0, currEnd = 0;

        for (int i = 0; i < 26; ++i) {
            if (indexOfFirstAndLastOccurrences[i][0] < 0) {
                continue;
            }
            if ((start == -1) && (end == -1)) {
                start = indexOfFirstAndLastOccurrences[i][0];
                end = indexOfFirstAndLastOccurrences[i][1];
                continue;
            }
            currStart = indexOfFirstAndLastOccurrences[i][0];
            currEnd = indexOfFirstAndLastOccurrences[i][1];
            if (currStart < end) {
                end = Math.max(end, currEnd);
            } else {
                mergedNonOverlappingIntervals.add(new int[]{start, end});
                start = currStart;
                end = currEnd;
            }
        }

        mergedNonOverlappingIntervals.add(new int[]{start, end});

        List<Integer> result = new ArrayList<>();
        for (int[] interval : mergedNonOverlappingIntervals) {
            result.add(interval[1] - interval[0] + 1);
        }

        return result;
    }
}
