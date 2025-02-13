import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberOfOperationsToExceedThresholdValueIITest {
    private MinimumNumberOfOperationsToExceedThresholdValueII systemUnderTest;

    @BeforeEach
    void setUp() {
        systemUnderTest = new MinimumNumberOfOperationsToExceedThresholdValueII();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void test_minOperations_null_array() {
        assertEquals(0, systemUnderTest.minOperations(null, ThreadLocalRandom.current().nextInt()));
    }

    @Test
    public void test_minOperations_empty_array() {
        assertEquals(0, systemUnderTest.minOperations(new int[]{}, ThreadLocalRandom.current().nextInt()));
    }

    @Test
    public void test_minOperations_1_element_in_array() {
        final int[] input = new int[]{ThreadLocalRandom.current().nextInt()};
        final int k = ThreadLocalRandom.current().nextInt();
        assertEquals(0, systemUnderTest.minOperations(input, k));
    }

    @Test
    public void test_minOperations_hardcoded_input_1() {
        final int[] input = new int[]{2, 11, 10, 1, 3};
        final int k = 10;
        assertEquals(2, systemUnderTest.minOperations(input, k));
    }

    @Test
    public void test_minOperations_hardcoded_input_2() {
        final int[] input = new int[]{1, 1, 2, 4, 9};
        final int k = 20;
        assertEquals(4, systemUnderTest.minOperations(input, k));
    }

    @Test
    public void test_minOperations_hardcoded_input_3() {
        final int[] input = new int[]{1000000000, 999999999, 1000000000, 999999999, 1000000000, 999999999};
        final int k = 1000000000;
        // this test case can cause overflow if Integer is used instead of Long
        assertEquals(2, systemUnderTest.minOperations(input, k));
    }
}