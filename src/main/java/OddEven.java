public class OddEven {

    /** Task 1
     * Create an OddEven algorithm that takes an integer as input,
     * returns "Odd" if the number is odd,
     * and "Even" if the number is even.
     * In all other cases, the result will be “Undefined”.
     *
     * Test Data:
     * -345 →  “Odd”
     * 0 →  “Even”
     * 222222 →  “Even”
     * 2147483647 + 1 →  “Undefined”
     */

    public String oddEvenAlgorithm(long number) {
        String odd = "Odd";
        String even = "Even";
        String undefined = "Undefined";

        if (number <= 2147483647L && number >= -2147483648L) {
            if (number % 2 == 0) {

                return even;
            } else {

                return odd;
            }
        }

        return undefined;
    }
}
