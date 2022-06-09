public class Intersection {

    /** Task 8
     * Write the algorithm Intersection
     * that takes 2 arrays of integers as input
     * and returns an array of common elements.
     *
     * Test Data:
     * {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
     * {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
     * {1, 2, 4, 5, 89}, {8, 9, 45} → {}
     */

    public int[] intersectionAlgorithm(int[] array1, int[] array2) {
        int count = 0;
        int[] newArray = new int[count];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    count++;
                    newArray[i] += array1[i];
                }
            }
        }
        return newArray;

    }









}

