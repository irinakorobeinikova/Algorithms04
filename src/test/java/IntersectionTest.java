import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class IntersectionTest {

    /** Task 8
     * Write the algorithm Intersection
     * that takes 2 arrays of integers as input
     * and returns an array of common elements.
     * <p>
     * Test Data:
     * {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
     * {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
     * {1, 2, 4, 5, 89}, {8, 9, 45} → {}
     */

    @Order(1)
    @Test
    public void testIntersectionHappyPathPositiveNumber() {

        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        Intersection as = new Intersection();
        int[] actualResult = as.intersectionAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testIntersectionHappyPathNegativeNumber() {

        int[] array1 = {1, -2, -4, 5, 89};
        int[] array2 = {8, 9, -4, -2};
        int[] expectedResult = {-2, -4};

        Intersection as = new Intersection();
        int[] actualResult = as.intersectionAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testIntersectionHappyNoMatchesNumber() {

        int[] array1 = {1, 3, 7, 5, 89};
        int[] array2 = {8, 9, 2, -2};
        int[] expectedResult = {};

        Intersection as = new Intersection();
        int[] actualResult = as.intersectionAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testIntersectionOneArrayIsEmpty() {

        int[] array1 = {};
        int[] array2 = {8, 9, 2, -2};
        int[] expectedResult = {};

        Intersection as = new Intersection();
        int[] actualResult = as.intersectionAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testIntersectionManyDuplicatesInArray() {

        int[] array1 = {1, 2, 4, 5, 89, 4, 4, 2};
        int[] array2 = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        Intersection as = new Intersection();
        int[] actualResult = as.intersectionAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testIntersectionManyDuplicatesInBothArrays() {

        int[] array1 = {1, 2, 4, 5, 89, 89, 2, 2, 4};
        int[] array2 = {8, 9, 4, 2, 9, 8, 4, 2, 2};
        int[] expectedResult = {2, 4};

        Intersection as = new Intersection();
        int[] actualResult = as.intersectionAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
