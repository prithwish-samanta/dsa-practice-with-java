package com.algo.arrays;

/**
 * You have been given an array ‘a’ of ‘n’ unique non-negative integers.
 * Find the second largest and second-smallest element from the array.
 * Return the two elements (second largest and second smallest) as another array of size 2.
 * Example :
 * Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
 * Output: [4, 2]
 * The second-largest element after 5 is 4, and the second-smallest element after 1 is 2.
 */
public class SecondLargestNumber {
    int[] getSecondOrderElements(int n, int[] a) {
        int largest = Integer.MIN_VALUE, second_largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE, second_smallest = Integer.MAX_VALUE;
        for (int val : a) {
            if (val > largest) {
                second_largest = largest;
                largest = val;
            } else if (val > second_largest && val != largest) {
                second_largest = val;
            }
            if (val < smallest) {
                second_smallest = smallest;
                smallest = val;
            } else if (val < second_smallest && val != smallest) {
                second_smallest = val;
            }
        }
        return new int[]{second_largest, second_smallest};
    }
}
