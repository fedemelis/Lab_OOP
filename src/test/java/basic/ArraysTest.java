package basic;

import esercizi.basics.MyArrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraysTest {
    @Test
    public void divideArray() {
        double[] input = {5.0, 4.0, 6.0, 2.0};
        assertArrayEquals(new double[]{2.5, 2.0, 3.0, 1.0}, MyArrays.divideArray(input, 2.0), 0.01);
    }

    @Test
    public void divideArrays() {
        double[] v1 = {5.0, 4.0, 6.0, 2.0};
        double[] v2 = {10.0, 2.0, 3.0, 8.0};
        assertArrayEquals(new double[]{0.5, 2.0, 2.0, 0.25}, MyArrays.divideArrays(v1, v2), 0.01);
    }

    @Test
    public void bubbleSort() {
        int[] input = {5, 4, 6, 2, 3, 4};
        assertArrayEquals(new int[]{2, 3, 4, 4, 5, 6}, MyArrays.bubbleSort(input));
    }

    @Test
    public void fibonacci() {
        assertArrayEquals(new long[]{0}, MyArrays.fibonacci(1));
        assertArrayEquals(new long[]{0, 1}, MyArrays.fibonacci(2));
        assertArrayEquals(new long[]{0, 1, 1, 2, 3}, MyArrays.fibonacci(5));
    }

    @Test
    public void splitter() {
        assertArrayEquals(new int[]{2, 3, 4, 4, 5, 6}, MyArrays.splitter(234456));
    }
}