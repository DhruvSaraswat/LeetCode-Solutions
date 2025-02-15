import java.util.ArrayList;
import java.util.List;

class FindPunishmentNumberOfInteger {
    private final static boolean[] doesSubstringAddToNum = new boolean[1001];
    private static final long[] prefixSum = new long[1001];

    static {
        doesSubstringAddToNum[1] = true;
        prefixSum[1] = 1;
        for (int i = 2; i <= 1000; ++i) {
            doesSubstringAddToNum[i] = doesSubstringAddUpToNumber(i);
            prefixSum[i] = doesSubstringAddToNum[i] ? (prefixSum[i - 1] + ((long) i * i)) : prefixSum[i - 1];
        }
    }

    public int punishmentNumber(int n) {
        // this check is not needed as per the problem constraints
        if (n < 1) {
            return 0;
        }
        return (int) prefixSum[n];
    }

    private static boolean doesSubstringAddUpToNumber(int num) {
        return generatePartitions(String.valueOf(num * num), 0, new ArrayList<>(), num);
    }

    public static boolean generatePartitions(String s, int index, List<String> current, int num) {
        if (index == s.length()) {
            int sum = 0;
            for (String str : current) {
                sum += Integer.parseInt(str);
            }
            return sum == num;
        }

        for (int i = index; i < s.length(); i++) {
            String partition = s.substring(index, i + 1);
            current.add(partition);
            if (generatePartitions(s, i + 1, current, num)) {
                return true;
            }
            current.remove(current.size() - 1);
        }

        return false;
    }
}