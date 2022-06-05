public class AreNumbersEqual {

    /** Write an algorithm AreNumbersEqual that takes any 2 int numbers as input
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

    public int areNumbersEqualAlgorithm(int num1, int num2) {

        if (num1 == num2) {

            return 0;
        } else if (num1 < num2) {

            return -1;
        } else {

            return 1;
        }
    }
}
