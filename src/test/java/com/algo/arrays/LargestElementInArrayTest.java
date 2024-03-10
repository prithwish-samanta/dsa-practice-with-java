package com.algo.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestElementInArrayTest {
    @Test
    void testLargestElementWithPositiveNumbers() {
        LargestElementInArray largestElementInArray = new LargestElementInArray();
        int[] arr = {3, 7, 1, 9, 4, 6};
        int n = arr.length;
        int result = largestElementInArray.largestElement(arr, n);
        assertEquals(9, result);
    }

    @Test
    void testLargestElementWithNegativeNumbers() {
        LargestElementInArray largestElementInArray = new LargestElementInArray();
        int[] arr = {-3, -7, -1, -9, -4, -6};
        int n = arr.length;
        int result = largestElementInArray.largestElement(arr, n);
        assertEquals(-1, result);
    }

    @Test
    void testLargestElementWithMixedNumbers() {
        LargestElementInArray largestElementInArray = new LargestElementInArray();
        int[] arr = {3, -7, 1, -9, 4, -6};
        int n = arr.length;
        int result = largestElementInArray.largestElement(arr, n);
        assertEquals(4, result);
    }

    @Test
    void testLargestElementWithRepeatedNumbers() {
        LargestElementInArray largestElementInArray = new LargestElementInArray();
        int[] arr = {5, 5, 5, 5, 5};
        int n = arr.length;
        int result = largestElementInArray.largestElement(arr, n);
        assertEquals(5, result);
    }

    @Test
    void testLargestElementWithEmptyArray() {
        LargestElementInArray largestElementInArray = new LargestElementInArray();
        int[] arr = {};
        int n = arr.length;
        int result = largestElementInArray.largestElement(arr, n);
        assertEquals(Integer.MIN_VALUE, result); // Assuming Integer.MIN_VALUE as a representation for an empty array
    }
}