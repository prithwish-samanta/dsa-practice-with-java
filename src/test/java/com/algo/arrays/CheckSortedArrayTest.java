package com.algo.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckSortedArrayTest {
    @Test
    void testIsSortedAscendingOrder() {
        CheckSortedArray checkSortedArray = new CheckSortedArray();
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int result = checkSortedArray.isSorted(n, arr);
        assertEquals(1, result);
    }

    @Test
    void testIsSortedDescendingOrder() {
        CheckSortedArray checkSortedArray = new CheckSortedArray();
        int[] arr = {5, 4, 3, 2, 1};
        int n = arr.length;
        int result = checkSortedArray.isSorted(n, arr);
        assertEquals(-1, result);
    }

    @Test
    void testIsSortedNonDecreasingOrder() {
        CheckSortedArray checkSortedArray = new CheckSortedArray();
        int[] arr = {1, 2, 2, 3, 4, 5};
        int n = arr.length;
        int result = checkSortedArray.isSorted(n, arr);
        assertEquals(1, result);
    }

    @Test
    void testIsSortedNonIncreasingOrder() {
        CheckSortedArray checkSortedArray = new CheckSortedArray();
        int[] arr = {5, 4, 4, 3, 2, 1};
        int n = arr.length;
        int result = checkSortedArray.isSorted(n, arr);
        assertEquals(-1, result);
    }

    @Test
    void testIsSortedEqualConsecutiveElements() {
        CheckSortedArray checkSortedArray = new CheckSortedArray();
        int[] arr = {1, 1, 2, 2, 3, 3};
        int n = arr.length;
        int result = checkSortedArray.isSorted(n, arr);
        assertEquals(1, result);
    }

    @Test
    void testIsSortedEmptyArray() {
        CheckSortedArray checkSortedArray = new CheckSortedArray();
        int[] arr = {};
        int n = arr.length;
        int result = checkSortedArray.isSorted(n, arr);
        assertEquals(0, result);
    }
}