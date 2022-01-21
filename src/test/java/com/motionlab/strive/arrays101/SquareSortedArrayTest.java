package com.motionlab.strive.arrays101;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
class SquareSortedArrayTest {

    SquareSortedArray underTest;
    @BeforeEach
    void setUp() {
        underTest = new SquareSortedArray();
    }

    @Test
    @DisplayName("Should return sorted square array in non-decreasing order")
    void itShouldSortedSquaresTrivial() {
        // Given
        int[] nums = {-4,-1,0,3,10};
        int[] expectedOutput = {0,1,9,16,100};
        // When
        int[] methodOutput = underTest.sortedSquaresTrivial(nums);
        assertArrayEquals(expectedOutput, methodOutput);
        assertNotNull(methodOutput);
        for (int i = 0; i < methodOutput.length; i++) {
            assertEquals(expectedOutput[i], methodOutput[i]);
        }
        // Then
    }

    @Test
    @DisplayName("Should work more efficient option")
    void itShouldSortedSquaresEfficient() {
        // Given
        int[] nums = {-4,-1,0,3,10};
        int[] expectedOutput = {0,1,9,16,100};
        // When
        int[] methodOutput = underTest.sortedSquaresEfficient(nums);
        assertArrayEquals(expectedOutput, methodOutput);
        assertNotNull(methodOutput);
        for (int i = 0; i < methodOutput.length; i++) {
            assertEquals(expectedOutput[i], methodOutput[i]);
        }
        // Then
    }
}