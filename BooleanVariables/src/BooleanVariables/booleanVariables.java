package BooleanVariables;

/**
 * BooleanVariables
 * ----------------
 * This class demonstrates the use of boolean variables in Java.
 * It explains how boolean values are produced using:
 * - Comparison operators (>, <, >=, <=, ==)
 * - Logical operators (AND, OR, NOT)
 *
 * Boolean expressions are commonly used in conditions,
 * decision-making, and control structures such as if-statements.
 */
public class booleanVariables {

    /**
     * The main method is the entry point of the program.
     * It evaluates several boolean expressions and prints
     * their results to the console.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        /* ---------------------------------------------------------
         * 1. Boolean variables
         * ---------------------------------------------------------
         * A boolean variable can hold only two values:
         * true or false
         */

        boolean booleanVariable = 5 > 5;   // false because 5 is NOT greater than 5
        System.out.println(booleanVariable);

        boolean booleanVariable2 = 5 >= 5; // true because 5 is equal to 5
        System.out.println(booleanVariable2);

        /* ---------------------------------------------------------
         * 2. Example: Checking pass or fail
         * ---------------------------------------------------------
         */

        boolean isThisPassGrade = 70 >= 60; // true because 70 is a passing grade
        System.out.println(isThisPassGrade);

        /* ---------------------------------------------------------
         * 3. Equality comparison (==)
         * ---------------------------------------------------------
         * Checks if two values are exactly equal.
         */

        boolean isEqual5 = 5 == 5; // true
        System.out.println(isEqual5);

        /* ---------------------------------------------------------
         * 4. Logical AND (&&)
         * ---------------------------------------------------------
         * Both conditions must be true for the result to be true.
         */

        boolean isExcellent = 91 >= 60 && 91 >= 90;
        // Student must pass AND have a grade of 90 or more
        System.out.println("Is Excellent: " + isExcellent);

        /* ---------------------------------------------------------
         * 5. Logical OR (||)
         * ---------------------------------------------------------
         * At least one condition must be true.
         */

        boolean isPass = 59 > 90 || 59 >= 60;
        // Both conditions are false, so result is false
        System.out.println("Is Pass: " + isPass);

        /* ---------------------------------------------------------
         * 6. Logical NOT (!)
         * ---------------------------------------------------------
         * Reverses the boolean value.
         */

        boolean isBlocked = true;
        // NOT true becomes false
        System.out.println(!isBlocked);
    }
}
