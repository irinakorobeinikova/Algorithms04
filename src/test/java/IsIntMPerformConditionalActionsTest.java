import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class IsIntMPerformConditionalActionsTest {

    /** Given an integer M perform the following conditional actions:
     *  If M is multiple of 3 and 5 then return "Good Number".
     *  If M is only multiple of 3 and not of 5 then return "Bad Number".
     *  If M is only multiple of 5 and not of 3 then return "Poor Number".
     *  If M doesn't satisfy any of the above conditions then return "-1".
     */

    @Order(1)
    @Test
    public void testIsIntMPerformConditionalActionsHappyPathMultipleThreeAndFive() {
        int num = 15;
        String expectedResult = "Good Number";

        IsIntMPerformConditionalActions as = new IsIntMPerformConditionalActions();
        String actualResult = as.isIntMPerformConditionalActionsAlgorithm(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testIsIntMPerformConditionalActionsHappyPathMultipleOnlyThree() {
        int num = 9;
        String expectedResult = "Bad Number";

        IsIntMPerformConditionalActions as = new IsIntMPerformConditionalActions();
        String actualResult = as.isIntMPerformConditionalActionsAlgorithm(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testIsIntMPerformConditionalActionsHappyPathMultipleOnlyFive() {
        int num = 25;
        String expectedResult = "Poor Number";

        IsIntMPerformConditionalActions as = new IsIntMPerformConditionalActions();
        String actualResult = as.isIntMPerformConditionalActionsAlgorithm(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testIsIntMPerformConditionalActionsHappyPathMultipleThreeAndFiveNegativeNum() {
        int num = -15;
        String expectedResult = "Good Number";

        IsIntMPerformConditionalActions as = new IsIntMPerformConditionalActions();
        String actualResult = as.isIntMPerformConditionalActionsAlgorithm(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testIsIntMPerformConditionalActionsHappyPathMultipleOnlyThreeNegativeNum() {
        int num = -9;
        String expectedResult = "Bad Number";

        IsIntMPerformConditionalActions as = new IsIntMPerformConditionalActions();
        String actualResult = as.isIntMPerformConditionalActionsAlgorithm(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testIsIntMPerformConditionalActionsHappyPathMultipleOnlyFiveNegativeNum() {
        int num = -25;
        String expectedResult = "Poor Number";

        IsIntMPerformConditionalActions as = new IsIntMPerformConditionalActions();
        String actualResult = as.isIntMPerformConditionalActionsAlgorithm(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testIsIntMPerformConditionalActionsHappyPathNotMultipleNum() {
        int num = 16;
        String expectedResult = "-1";

        IsIntMPerformConditionalActions as = new IsIntMPerformConditionalActions();
        String actualResult = as.isIntMPerformConditionalActionsAlgorithm(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testIsIntMPerformConditionalActionsHappyPathNotMultipleNegativeNum() {
        int num = -29;
        String expectedResult = "-1";

        IsIntMPerformConditionalActions as = new IsIntMPerformConditionalActions();
        String actualResult = as.isIntMPerformConditionalActionsAlgorithm(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(8)
    @Test
    public void testIsIntMPerformConditionalActionsZero() {
        int num = 0;
        String expectedResult = "Good Number";

        IsIntMPerformConditionalActions as = new IsIntMPerformConditionalActions();
        String actualResult = as.isIntMPerformConditionalActionsAlgorithm(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }




}
