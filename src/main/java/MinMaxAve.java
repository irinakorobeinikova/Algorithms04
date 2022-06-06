public class MinMaxAve {

    /** Task 8
     * Write the algorithm MinMaxAve that takes an array of int[] numbers and 2 index values.
     * The algorithm returns an array that contains the minimum value, maximum value,
     * and the average of all value between 2 indices.
     *
     * Test Data:
     * ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
     */

    public int[] minMaxAveAlgorithm(int[] array, int index1, int index2) {

        if (array == null || array.length < 1 || index1 < 0 || index1 > index2 || index2 > array.length) {

            return new int[] {};
        }

        int minValue = array[index1];
        int maxValue = array[index2];
        int aveValue = 0;
        int sum = 0;

        for (int i = index1; i <= index2; i++) {
            if (array[index1] < array[i]) {
                maxValue = array[i];
            }
            if (array[index1] > array[i]) {
                minValue = array[i];
            }
            sum += array[i];
        }

        aveValue = sum / (index2 - index1 + 1);
        int[] result = {minValue, maxValue, aveValue};

        return result;
    }
}
