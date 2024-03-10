package com.algo.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LeftRotateArrayByOneTest {
    @Test
    void testRotateArray() {
        LeftRotateArrayByOne leftRotateArrayByOne = new LeftRotateArrayByOne();
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] result = leftRotateArrayByOne.rotateArray(arr, n);
        int[] expected = {2, 3, 4, 5, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    void testRotateArrayWithEmptyArray() {
        LeftRotateArrayByOne leftRotateArrayByOne = new LeftRotateArrayByOne();
        int[] arr = {};
        int n = arr.length;
        int[] result = leftRotateArrayByOne.rotateArray(arr, n);
        int[] expected = {};
        assertArrayEquals(expected, result);
    }

    @Test
    void testRotateArrayWithSingleElementArray() {
        LeftRotateArrayByOne leftRotateArrayByOne = new LeftRotateArrayByOne();
        int[] arr = {1};
        int n = arr.length;
        int[] result = leftRotateArrayByOne.rotateArray(arr, n);
        int[] expected = {1};
        assertArrayEquals(expected, result);
    }

    @Test
    void testRotateArrayWithRepeatedElements() {
        LeftRotateArrayByOne leftRotateArrayByOne = new LeftRotateArrayByOne();
        int[] arr = {1, 1, 2, 2, 3};
        int n = arr.length;
        int[] result = leftRotateArrayByOne.rotateArray(arr, n);
        int[] expected = {1, 2, 2, 3, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    void testRotateArrayWithNegativeNumbers() {
        LeftRotateArrayByOne leftRotateArrayByOne = new LeftRotateArrayByOne();
        int[] arr = {-3, -2, -1, 0, 1};
        int n = arr.length;
        int[] result = leftRotateArrayByOne.rotateArray(arr, n);
        int[] expected = {-2, -1, 0, 1, -3};
        assertArrayEquals(expected, result);
    }
}