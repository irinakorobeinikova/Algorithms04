import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {

    /** Task 5
     * Write an algorithm IsPositiveNumber
     * that returns true if the numerical parameter is greater than or equal to zero
     * and returns false if the parameter is less than 0.
     *
     * Check the method on the numbers 555, 0 and -555.
     */

    @Order(1)
    @Test
    public void testisPositiveNumberHappyPathPositiveNumber() {
        int num = 555;
        boolean expectedResult = true;

        IsPositiveNumber as = new IsPositiveNumber();
        boolean actualResult = as.isPositiveNumberAlgorithm(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testisPositiveNumberHappyPathNegativeNumber() {
        int num = -555;
        boolean expectedResult = false;

        IsPositiveNumber as = new IsPositiveNumber();
        boolean actualResult = as.isPositiveNumberAlgorithm(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testisPositiveNumberHappyPathZero() {
        int num = 0;
        boolean expectedResult = true;

        IsPositiveNumber as = new IsPositiveNumber();
        boolean actualResult = as.isPositiveNumberAlgorithm(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testisPositiveNumberMinValue() {
        int num = Integer.MIN_VALUE;
        boolean expectedResult = false;

        IsPositiveNumber as = new IsPositiveNumber();
        boolean actualResult = as.isPositiveNumberAlgorithm(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testisPositiveNumberMaxValue() {
        int num = Integer.MAX_VALUE;
        boolean expectedResult = true;

        IsPositiveNumber as = new IsPositiveNumber();
        boolean actualResult = as.isPositiveNumberAlgorithm(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }




}
