package com.motionlab.strive.arrays101;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class DuplicateZeros {

    /**
     * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
     * Input: arr = [1,0,2,3,0,4,5,0]
     * Output: [1,0,0,2,3,0,0,4]
     * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
     *
     * Input: arr = [1,2,3]
     * Output: [1,2,3]
     * Explanation: After calling your function, the input array is modified to: [1,2,3]
     */
    public void duplicateZeros(int[] arr) {

        int length = arr.length;
        // traverse the entire array, from left to right O(n)
        for (int i = 0; i < length - 1; i++) {
            // The minute i hit the first zero
            if (arr[i] == 0) {
                 i += 1; // I will insert a zero next to it
                 // create space
                 for (int j = length - 2; j >= i; j--) {
                     arr[j + 1] = arr[j];
                 }
                 arr[i] = 0;
            }
        }
    }

    public void duplicateZerosUsingQueueDS(int[] arr) {

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                queue.add(0);
                queue.add(0);
            } else {
                queue.add(arr[i]);
            }
            Integer first = queue.poll();
            arr[i] = first;
        }

    }
}
