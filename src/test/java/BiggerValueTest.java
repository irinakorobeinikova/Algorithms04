import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class BiggerValueTest {

    /**
     * Task 4
     * Write an algorithm BiggerValue
     * that returns the larger value of two int parameters.
     *
     * Test Data:
     * 3333, 9999
     * Expected Result = 9999
     */

    @Order(1)
    @Test
    public void testBiggerValueHappyPathPositiveNumber() {
        int number1 = 3333;
        int number2 = 9999;
        int expectedResult = 9999;

        BiggerValue as = new BiggerValue();
        int actualResult = as.biggerValueAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testBiggerValueHappyPathNegativeNumber() {
        int number1 = -3333;
        int number2 = -9999;
        int expectedResult = -3333;

        BiggerValue as = new BiggerValue();
        int actualResult = as.biggerValueAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testBiggerValueHappyPathNegativePositiveNumbers() {
        int number1 = 3333;
        int number2 = -9999;
        int expectedResult = 3333;

        BiggerValue as = new BiggerValue();
        int actualResult = as.biggerValueAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testBiggerValueEqualNumbers() {
        int number1 = 5555;
        int number2 = 5555;
        int expectedResult = 0;

        BiggerValue as = new BiggerValue();
        int actualResult = as.biggerValueAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testBiggerValueZeroAndNumber() {
        int number1 = 0;
        int number2 = -3333;
        int expectedResult = 0;

        BiggerValue as = new BiggerValue();
        int actualResult = as.biggerValueAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testBiggerValueZeroAndZero() {
        int number1 = 0;
        int number2 = 0;
        int expectedResult = 0;

        BiggerValue as = new BiggerValue();
        int actualResult = as.biggerValueAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
