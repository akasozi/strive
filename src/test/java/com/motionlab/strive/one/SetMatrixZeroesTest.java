package com.motionlab.strive.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
class SetMatrixZeroesTest {

    SetMatrixZeroes underTest;
    @BeforeEach
    void setUp() {
        underTest = new SetMatrixZeroes();
    }

    @Test
    void itShouldSetMatrixZero() {
        // Given
        int[][] input = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] expectedOutput = {{0,0,0,0},{0,4,5,0},{0,3,1,0}};
        // When
        int[][] actualOutput = underTest.setMatrixZero(input);
        // Then
        assertArrayEquals(expectedOutput, actualOutput);
    }
}