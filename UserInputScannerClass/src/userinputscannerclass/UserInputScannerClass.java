package userinputscannerclass;

import java.util.Scanner;

/**
 * UserInputScannerClass
 * --------------------
 * This class demonstrates how to use the Scanner class in Java
 * to read input from the user through the keyboard.
 *
 * The program collects basic student information such as:
 * - Name
 * - GPA
 * - Age
 * - A short text summary
 *
 * This example is designed for beginner students learning
 * how to build interactive console programs.
 */
public class UserInputScannerClass {

    /**
     * The main method is the entry point of the program.
     * It creates a Scanner object and uses it to read
     * different types of user input.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Create a Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);

        /* ---------------------------------------------------------
         * 1. Reading a String using next()
         * ---------------------------------------------------------
         * next() reads a single word (stops at space).
         */

        System.out.println("Enter your name: ");
        String studentName = input.next();
        System.out.println("My name is: " + studentName);

        /* ---------------------------------------------------------
         * 2. Reading a double value (GPA)
         * ---------------------------------------------------------
         * nextDouble() reads decimal numbers.
         */

        System.out.println("Enter your GPA: ");
        double gpa = input.nextDouble();
        System.out.println("My GPA is: " + gpa);

        /* ---------------------------------------------------------
         * 3. Reading an integer value (Age)
         * ---------------------------------------------------------
         * nextInt() reads whole numbers.
         */

        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("My age is: " + age);

        /* ---------------------------------------------------------
         * 4. Reading a full line of text using nextLine()
         * ---------------------------------------------------------
         * Important:
         * After using nextInt() or nextDouble(), there is still
         * a newline character left in the input buffer.
         * We must consume it before calling nextLine().
         */

        System.out.println("Enter your summary: ");

        // Consume the leftover newline character
        input.nextLine();

        // Read the full line of text
        String summary = input.nextLine();
        System.out.println("Your summary is: " + summary);

        // Close the scanner (good practice)
        input.close();
    }
}
