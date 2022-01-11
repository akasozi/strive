package com.motionlab.strive.arrays101;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class MaxConsecutiveOnes {

    /**
     * You need to think about two things as far as any window is concerned.
     * One is the starting point for the window. How do you detect that a new window of 1s has started?
     * The next part is detecting the ending point for this window. How do you detect the ending point for an existing window?
     * If you figure these two things out, you will be able to detect the windows of consecutive ones.
     * All that remains afterward is to find the longest such window and return the size.
     *
     * Given a binary array nums, return the maximum number of consecutive 1's in the array.
     *
     * Input: nums = [1,1,0,1,1,1]
     * Output: 3
     * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
     */
    public int findMaxConsecutiveOnes(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;

        int max = 0; int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
