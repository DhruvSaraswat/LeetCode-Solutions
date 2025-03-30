import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {
    private MergeIntervals systemUnderTest;

    @BeforeEach
    void setUp() {
        systemUnderTest = new MergeIntervals();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void test_merge_null_intervals() {
        int[][] actualResult = systemUnderTest.merge(null);
        assertEquals(0, actualResult.length);
    }

    @Test
    public void test_merge_0_intervals() {
        int[][] actualResult = systemUnderTest.merge(new int[0][0]);
        assertEquals(0, actualResult.length);
    }

    @Test
    public void test_merge_1_interval() {
        int[][] intervals = {{1, 4}};
        int[][] actualResult = systemUnderTest.merge(intervals);
        assertEquals(actualResult, intervals);
    }

    @Test
    public void test_merge_hardcoded_input_1() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] actualResult = systemUnderTest.merge(intervals);
        assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}}, actualResult);
    }

    @Test
    public void test_merge_hardcoded_input_2() {
        int[][] intervals = {{1, 4}, {4, 5}};
        int[][] actualResult = systemUnderTest.merge(intervals);
        assertArrayEquals(new int[][]{{1, 5}}, actualResult);
    }

    @Test
    public void test_merge_hardcoded_input_3() {
        int[][] intervals = {{1, 4}, {2, 3}};
        int[][] actualResult = systemUnderTest.merge(intervals);
        assertArrayEquals(new int[][]{{1, 4}}, actualResult);
    }
}