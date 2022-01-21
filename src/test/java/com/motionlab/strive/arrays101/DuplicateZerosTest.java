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
class DuplicateZerosTest {

    DuplicateZeros underTest;
    @BeforeEach
    void setUp() {
        underTest = new DuplicateZeros();
    }

    @Test
    @DisplayName("Should duplicate zeros and shift elements to the right!")
    void itShouldDuplicateZeros() {
        // Given
        int[] input = {1,0,2,3,0,4,5,0};
        int[] expectedOutput = {1,0,0,2,3,0,0,4};
        // When
        underTest.duplicateZeros(input);
        // Then
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    @DisplayName("Should duplicate zeros using Queue Data structure")
    void itShouldDuplicateZerosUsingQueueDS() {
        // Given
        int[] input = {1,0,2,3,0,4,5,0};
        int[] expectedOutput = {1,0,0,2,3,0,0,4};
        // When
        underTest.duplicateZerosUsingQueueDS(input);
        // Then
        assertArrayEquals(expectedOutput, input);
    }
}