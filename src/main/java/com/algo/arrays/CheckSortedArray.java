package com.algo.arrays;

/**
 * Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not.
 * If the array is sorted then return True, Else return False.
 * Note: Two consecutive equal values are considered to be sorted.
 */
public class CheckSortedArray {
    int isSorted(int n, int[] a) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        for (int i = 1; i < n; ++i) {
            if (a[i] < a[i - 1])
                return -1;
        }
        return 1;
    }
}
