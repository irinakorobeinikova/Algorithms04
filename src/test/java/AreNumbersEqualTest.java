import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {

    /** Task 6
     * Write an algorithm AreNumbersEqual that takes any 2 int numbers as input
     * and returns 0 if the numbers are equal,
     * -1, if the first number is less than the second,
     * 1, if the first number is larger than the second.
     *
     * Test Data:
     * 89, 89
     * Expected result: 0
     * -89, 89
     * Expected result: -1
     * 89, -89
     * Expected result: 1
     */

    @Order(1)
    @Test
    public void testAreNumbersEqualHappyPathEqualNumbers() {
        int num1 = 89;
        int num2 = 89;
        int expectedResult = 0;

        AreNumbersEqual as = new AreNumbersEqual();
        int actualResult = as.areNumbersEqualAlgorithm(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testAreNumbersEqualHappyPathFirstNumberIsLess() {
        int num1 = -89;
        int num2 = 89;
        int expectedResult = -1;

        AreNumbersEqual as = new AreNumbersEqual();
        int actualResult = as.areNumbersEqualAlgorithm(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testAreNumbersEqualHappyPathFirstNumberIsLarger() {
        int num1 = 89;
        int num2 = -89;
        int expectedResult = 1;

        AreNumbersEqual as = new AreNumbersEqual();
        int actualResult = as.areNumbersEqualAlgorithm(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testAreNumbersEqualTwoZero() {
        int num1 = 0;
        int num2 = 0;
        int expectedResult = 0;

        AreNumbersEqual as = new AreNumbersEqual();
        int actualResult = as.areNumbersEqualAlgorithm(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testAreNumbersEqualZeroAndMinValue() {
        int num1 = 0;
        int num2 = Integer.MIN_VALUE;
        int expectedResult = 1;

        AreNumbersEqual as = new AreNumbersEqual();
        int actualResult = as.areNumbersEqualAlgorithm(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testAreNumbersEqualZeroAndMaxValue() {
        int num1 = 0;
        int num2 = Integer.MAX_VALUE;
        int expectedResult = -1;

        AreNumbersEqual as = new AreNumbersEqual();
        int actualResult = as.areNumbersEqualAlgorithm(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
