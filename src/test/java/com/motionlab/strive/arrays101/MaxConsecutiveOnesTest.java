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
class MaxConsecutiveOnesTest {

    MaxConsecutiveOnes underTest;

    @BeforeEach
    void setUp() {
        underTest = new MaxConsecutiveOnes();
    }

    @Test
    @DisplayName("Simple - should work")
    void itShouldFindMaxConsecutiveOnes() {
        // [1,1,0,1,1,1]
        // Given
        int[] nums = {1,1,0,1,1,1};
        assertEquals(3, underTest.findMaxConsecutiveOnes(nums));
        // When
        // Then
    }

    @Test
    @DisplayName("Simple - should process edge cases correctly")
    void itShouldProcessEmptyArrayCorrectly() {
        // [1,1,0,1,1,1]
        // Given
        int[] nums = {};
        assertEquals(0, underTest.findMaxConsecutiveOnes(nums));
        // When
        // Then
    }

}