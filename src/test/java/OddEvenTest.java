import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class OddEvenTest {

    /** Create an OddEven algorithm that takes an integer as input,
     * returns "Odd" if the number is odd,
     * and "Even" if the number is even.
     * In all other cases, the result will be “Undefined”.
     *
     * Test Data:
     * -345 →  “Odd”
     * 0 →  “Even”
     * 222222 →  “Even”
     * 2147483647 + 1 →  “Undefined”
     */

    @Order(1)
    @Test
    public void testOddEvenHappyPathPositiveOddNumber() {
        long number = 1;
        String expectedResult = "Odd";

        OddEven as = new OddEven();
        String actualResult = as.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddEvenHappyPathPositiveEvenNumber() {
        long number = 2;
        String expectedResult = "Even";

        OddEven as = new OddEven();
        String actualResult = as.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testOddEvenHappyPathNegativeOddNumber() {
        long number = -1;
        String expectedResult = "Odd";

        OddEven as = new OddEven();
        String actualResult = as.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testOddEvenHappyPathNegativeEvenNumber() {
        long number = -2;
        String expectedResult = "Even";

        OddEven as = new OddEven();
        String actualResult = as.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testOddEvenHappyPathZeroNumber() {
        long number = 0;
        String expectedResult = "Even";

        OddEven as = new OddEven();
        String actualResult = as.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenNegativeUndefined() {
        long number = -2147483649L;
        String expectedResult = "Undefined";

        OddEven as = new OddEven();
        String actualResult = as.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenPositiveUndefined() {
        long number = 2147483648L;
        String expectedResult = "Undefined";

        OddEven as = new OddEven();
        String actualResult = as.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }







}
