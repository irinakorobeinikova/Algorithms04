public class OddIndices {

    /** Task 2
     * Write an OddIndices algorithm that is an array of values
     * and uses an array of odd index values.
     *
     * Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
     */

    public int[] OddIndicesAlgorithm(int[] array) {
        if (array.length > 0) {

            int[] result = new int[array.length / 2];
            int j = 0;

            for (int i = 1; i < array.length; i += 2) {
                    result[j] = array[i];
                    j++;
            }

            return result;

        }

        return new int []{};
    }
}

