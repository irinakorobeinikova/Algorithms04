public class SumArray {

    /** Task 3
     * Write algorithm SumArray
     * that returns the sum of all numbers in an array.
     *
     * Test Data:
     * {0, 1, 2, 3, 4, 5} → 15
     * {-7, -3} → -10
     */

    public int sumArrayAlgorithm(int[] array) {
        if (array.length > 0) {

            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                array[i] += sum;
            }

            return sum;
        }

        return 0;
    }








}
