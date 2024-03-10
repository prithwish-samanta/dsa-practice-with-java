package com.algo.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SecondLargestNumberTest {
    @Test
    void testGetSecondOrderElements() {
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = secondLargestNumber.getSecondOrderElements(arr.length, arr);
        int[] expected = {4, 2};
        assertArrayEquals(expected, result);
    }

    @Test
    void testGetSecondOrderElementsWithRepeatedValues() {
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int[] arr = {5, 2, 3, 5, 1};
        int[] result = secondLargestNumber.getSecondOrderElements(arr.length, arr);
        int[] expected = {3, 2};
        assertArrayEquals(expected, result);
    }

    @Test
    void testGetSecondOrderElementsWithDescendingOrder() {
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int[] arr = {5, 4, 3, 2, 1};
        int[] result = secondLargestNumber.getSecondOrderElements(arr.length, arr);
        int[] expected = {4, 2};
        assertArrayEquals(expected, result);
    }

    @Test
    void testGetSecondOrderElementsWithAscendingOrder() {
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = secondLargestNumber.getSecondOrderElements(arr.length, arr);
        int[] expected = {4, 2};
        assertArrayEquals(expected, result);
    }
}