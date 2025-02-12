package com.leetcode.solutions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.*;

class MaxSumOfAPairWithEqualSumOfDigitsTest {
    private MaxSumOfAPairWithEqualSumOfDigits systemUnderTest;

    @BeforeEach
    void setUp() {
        systemUnderTest = new MaxSumOfAPairWithEqualSumOfDigits();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void test_maximumSum_null_nums() {
        assertEquals(-1, systemUnderTest.maximumSum(null));
    }

    @Test
    public void test_maximumSum_emptyArray() {
        assertEquals(-1, systemUnderTest.maximumSum(new int[]{}));
    }

    @Test
    public void test_maximumSum_1ElementInArray() {
        final int randomInt = ThreadLocalRandom.current().nextInt();
        assertEquals(-1, systemUnderTest.maximumSum(new int[]{randomInt}));
    }

    @Test
    public void test_maximumSum_hardcoded_input_1() {
        final int[] input = new int[]{18, 43, 36, 13, 7};
        assertEquals(54, systemUnderTest.maximumSum(input));
    }

    @Test
    public void test_maximumSum_hardcoded_input_2() {
        final int[] input = new int[]{10, 12, 19, 14};
        assertEquals(-1, systemUnderTest.maximumSum(input));
    }

    @Test
    public void test_maximumSum_hardcoded_input_3() {
        final int[] input = new int[]{4, 6, 10, 6};
        assertEquals(12, systemUnderTest.maximumSum(input));
    }
}