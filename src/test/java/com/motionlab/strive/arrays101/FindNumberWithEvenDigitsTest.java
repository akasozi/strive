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
class FindNumberWithEvenDigitsTest {

    FindNumberWithEvenDigits underTest;

    @BeforeEach
    void setUp() {
        underTest = new FindNumberWithEvenDigits();
    }

    @Test
    @DisplayName("Simple - should work")
    void itShouldFindNumbers() {
        // [555,901,482,1771]
        // Given
        int[] nums = {555,901,482,1771};
        assertEquals(1, underTest.findNumbers(nums));
        // When
        // Then
    }
}