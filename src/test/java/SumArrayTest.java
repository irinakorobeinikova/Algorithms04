import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class SumArrayTest {

    /** Task 3
     * Write algorithm SumArray
     * that returns the sum of all numbers in an array.
     *
     * Test Data:
     * {0, 1, 2, 3, 4, 5} → 15
     * {-7, -3} → -10
     */

    @Order(1)
    @Test
    public void testSumArrayHappyPathPositiveNumber() {
        int[] array = {1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray as = new SumArray();
        int actualResult = as.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testSumArrayHappyPathNegativeNumber() {
        int[] array = {-1, -2, -3};
        int expectedResult = -6;

        SumArray as = new SumArray();
        int actualResult = as.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testSumArrayZero() {
        int[] array = {0};
        int expectedResult = 0;

        SumArray as = new SumArray();
        int actualResult = as.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }




}
