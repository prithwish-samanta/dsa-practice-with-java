package com.algo.arrays;

/**
 * Problem Statement: Given an array of N integers, left rotate the array by one place.
 */
public class LeftRotateArrayByOne {
    int[] rotateArray(int[] arr, int n) {
        if (n > 1) {
            int first = arr[0];
            for (int i = 0; i < n - 1; ++i) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = first;
        }
        return arr;
    }
}
