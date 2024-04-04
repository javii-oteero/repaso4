package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {
    @Test
    public void testReverso1() {
        int[] v = {1, 2, 3, 4, 5, 6};
        int[] expectedOutput = {6, 5, 4, 3, 2, 1};
        assertArrayEquals(expectedOutput, Vector.reverso(v));
    }
}