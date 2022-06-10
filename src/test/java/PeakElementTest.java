import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class PeakElementTest {

    /** Task 10
     * Write the algorithm PeakElement that takes an array of integers as input
     * and returns the values of peak elements (elements that are larger than their neighbors).
     *
     * Test Data:
     * {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
     */

    @Order(1)
    @Test
    public void testPeakElementHappyPathPositiveNumber() {

        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        PeakElement as = new PeakElement();
        int[] actualResult = as.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }








}
