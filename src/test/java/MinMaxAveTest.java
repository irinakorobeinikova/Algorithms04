import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {

    /** Task 8
     * Write the algorithm MinMaxAve that takes an array of int[] numbers and 2 index values.
     * The algorithm returns an array that contains the minimum value, maximum value,
     * and the average of all value between 2 indices.
     *
     * Test Data:
     * ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
     */

    @Order(1)
    @Test
    public void testMinMaxAveHappyPath() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int a = 2;
        int b = 6;
        int[] expectedResult = {3, 7, 5};

        MinMaxAve as = new MinMaxAve();
        int[] actualResult = as.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testMinMaxAveHappyPathNegativeNumbers() {

        int[] array = {-1, -2, -3, -4, -5, -6, -7, -8};
        int a = 2;
        int b = 6;
        int[] expectedResult = {-7, -7, -5};

        MinMaxAve as = new MinMaxAve();
        int[] actualResult = as.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testMinMaxAveEmptyArray() {

        int[] array = {};
        int a = 2;
        int b = 6;
        int[] expectedResult = {};

        MinMaxAve as = new MinMaxAve();
        int[] actualResult = as.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testMinMaxAveNegativeIndices() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int a = -2;
        int b = 6;
        int[] expectedResult = {};

        MinMaxAve as = new MinMaxAve();
        int[] actualResult = as.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testMinMaxAveSimilarIndices() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int a = 2;
        int b = 2;
        int[] expectedResult = {3, 3, 3};

        MinMaxAve as = new MinMaxAve();
        int[] actualResult = as.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testMinMaxAveZeroIndices() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int a = 0;
        int b = 2;
        int[] expectedResult = {1, 3, 2};

        MinMaxAve as = new MinMaxAve();
        int[] actualResult = as.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(8)
    @Test
    public void testMinMaxAveShortArray() {

        int[] array = {1, 2, 3, 4, 5,};
        int a = 1;
        int b = 6;
        int[] expectedResult = {};

        MinMaxAve as = new MinMaxAve();
        int[] actualResult = as.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }








}
