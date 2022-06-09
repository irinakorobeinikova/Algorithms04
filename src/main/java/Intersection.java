public class Intersection {

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

    public int[] intersectionAlgorithm(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i] == array1[j]) {
                    array1[j] = -2147483648;
                }
            }
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = i + 1; j < array2.length; j++) {
                if (array2[i] == array2[j]) {
                    array2[j] = -2147483648;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j] == array1[i] && array1[i] != -2147483648 && array2[j] != -2147483648) {
                    count++;
                    break;
                }
            }
        }
        if (count == 0) {

            return new int[]{};
        } else {
            int[] result = new int[count];
            count = 0;
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array2[j] == array1[i] && array1[i] != -2147483648 && array2[j] != -2147483648) {
                        result[count] = array1[i];
                        count++;
                        break;
                    }
                }
            }

            return result;
        }
    }
}



