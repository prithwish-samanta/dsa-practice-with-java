package com.algo.arrays;

/**
 * Problem Statement: Given an array, we have to find the largest element in the array.
 */
public class LargestElementInArray {
    int largestElement(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > max)
                max = val;
        }
        return max;
    }
}
