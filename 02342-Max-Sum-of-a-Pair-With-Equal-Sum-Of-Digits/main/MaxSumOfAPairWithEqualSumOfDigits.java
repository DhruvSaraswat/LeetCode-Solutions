public class MaxSumOfAPairWithEqualSumOfDigits {
    public int maximumSum(int[] nums) {
        if ((nums == null) || (nums.length < 2)) {
            return -1;
        }

        final int maxPossibleSumOfDigits = getSumOfDigits((int)(1e9) - 1); // this is 81
        final int[] digitSumFreq = new int[maxPossibleSumOfDigits + 1]; // add 1 to prevent overflow

        int sumOfDigits = 0, maxSum = -1;

        for (int num : nums) {
            sumOfDigits = getSumOfDigits(num);

            // if we have already encountered another integer whose digits add up to the same value,
            // take the maximum of the maxSum and the other integer + the current num
            if (digitSumFreq[sumOfDigits] > 0) {
                maxSum = Math.max(maxSum, digitSumFreq[sumOfDigits] + num);
            }

            // save the maximum integer encountered so far which sums up to sumOfDigits
            digitSumFreq[sumOfDigits] = Math.max(digitSumFreq[sumOfDigits], num);
        }

        return maxSum;
    }

    private int getSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }
}
