package com.motionlab.strive.arrays101;

import java.util.Arrays;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class SquareSortedArray {

    /**
     * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
     * Input: nums = [-4,-1,0,3,10]
     * Output: [0,1,9,16,100]
     */

    public int[] sortedSquaresTrivial(int[] nums){

        // square O(n)
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        // sort O(nlogn)
        Arrays.sort(nums);
        return nums;
    }
}
