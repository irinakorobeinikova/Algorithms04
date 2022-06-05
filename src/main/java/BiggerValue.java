public class BiggerValue {

    /**
     * Task 4
     * Write an algorithm BiggerValue
     * that returns the larger value of two int parameters.
     *
     * Test Data:
     * 3333, 9999
     * Expected Result = 9999
     */

    public int biggerValueAlgorithm(int num1, int num2) {

        if (num1 != num2) {
            int maxNum;

            if (num1 > num2) {
                maxNum = num1;
            } else {
                maxNum = num2;
            }

            return maxNum;
        }

        return 0;
    }
}