package com.algo.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinearSearchTest {
    @Test
    void testLinearSearchElementPresent() {
        LinearSearch linearSearch = new LinearSearch();
        int[] arr = {1, 2, 3, 4, 5};
        int num = 3;
        int result = linearSearch.linearSearch(arr.length, num, arr);
        assertEquals(2, result);
    }

    @Test
    void testLinearSearchElementNotPresent() {
        LinearSearch linearSearch = new LinearSearch();
        int[] arr = {1, 2, 3, 4, 5};
        int num = 6;
        int result = linearSearch.linearSearch(arr.length, num, arr);
        assertEquals(-1, result);
    }

    @Test
    void testLinearSearchElementPresentAtFirstIndex() {
        LinearSearch linearSearch = new LinearSearch();
        int[] arr = {1, 2, 3, 4, 5};
        int num = 1;
        int result = linearSearch.linearSearch(arr.length, num, arr);
        assertEquals(0, result);
    }

    @Test
    void testLinearSearchElementPresentAtLastIndex() {
        LinearSearch linearSearch = new LinearSearch();
        int[] arr = {1, 2, 3, 4, 5};
        int num = 5;
        int result = linearSearch.linearSearch(arr.length, num, arr);
        assertEquals(4, result);
    }

    @Test
    void testLinearSearchEmptyArray() {
        LinearSearch linearSearch = new LinearSearch();
        int[] arr = {};
        int num = 3;
        int result = linearSearch.linearSearch(arr.length, num, arr);
        assertEquals(-1, result);
    }
}