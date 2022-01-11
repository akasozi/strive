package com.motionlab.strive.arrays101;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class FindNumberWithEvenDigits {

    /**
     * Given an array nums of integers, return how many of them contain an even number of digits.
     * Input: nums = [12,345,2,6,7896]
     * Output: 2
     * Explanation:
     * 12 contains 2 digits (even number of digits).
     * 345 contains 3 digits (odd number of digits).
     * 2 contains 1 digit (odd number of digits).
     * 6 contains 1 digit (odd number of digits).
     * 7896 contains 4 digits (even number of digits).
     * Therefore only 12 and 7896 contain an even number of digits.
     * @param nums
     * @return
     */
    public int findNumbers(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int numOfDigits = findNumberOfDigits(nums[i]);
            if (numOfDigits % 2 == 0)
                count++;
        }
        return count;
    }

    private int findNumberOfDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
