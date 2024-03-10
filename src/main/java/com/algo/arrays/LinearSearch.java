package com.algo.arrays;

/**
 * Problem Statement: Given an array, and an element num the task is to find if num is present in the given array or not.
 * If present print the index of the element or print -1.
 */
public class LinearSearch {
    int linearSearch(int n, int num, int[] arr) {
        for (int i = 0; i < n; ++i) {
            if (arr[i] == num)
                return i;
        }
        return -1;
    }
}
