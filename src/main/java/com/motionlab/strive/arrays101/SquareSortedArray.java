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

    public int[] sortedSquaresEfficient(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int pointer = nums.length - 1;
         // O(n) extra space
        int[] result = new int[nums.length];
        // O(n) time complexity
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
              result[pointer] = nums[left] * nums[left];
              left++;
            } else {
                result[pointer] = nums[right] * nums[right];
                right--;
            }
            pointer--;
        }
        return result;
    }
}
