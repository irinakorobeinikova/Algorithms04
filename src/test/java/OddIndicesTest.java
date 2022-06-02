import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {

    /** Task 2
     * Write an OddIndices algorithm that is an array of values
     * and uses an array of odd index values.
     *
     * Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
     */

    @Order(1)
    @Test
    public void testOddIndicesHappyPathEvenNumberOfIndices() {

        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices as = new OddIndices();
        int[] actualResult = as.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddIndicesHappyPathOddNumberOfIndices() {

        int[] array = {-45, 590, 234, 985, 12};
        int[] expectedResult = {590, 985};

        OddIndices as = new OddIndices();
        int[] actualResult = as.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testOddIndicesEmptyArray() {

        int[] array = {};
        int[] expectedResult = {};

        OddIndices as = new OddIndices();
        int[] actualResult = as.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testOddIndicesZero() {

        int[] array = {0};
        int[] expectedResult = {};

        OddIndices as = new OddIndices();
        int[] actualResult = as.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
