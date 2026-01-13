package switch_case;

import java.util.Scanner;

/**
 * This class demonstrates the use of the switch-case statement in Java.
 *
 * The program allows the user to choose between different evaluation modes
 * based on a menu:
 * 1- Pass or Fail evaluation.
 * 2- Detailed grade evaluation (excellent, very good, good, accepted).
 * 3- Scholarship eligibility evaluation (full or partial).
 *
 * The example combines switch-case with if-else statements
 * to show how they work together in real programs.
 */
public class Switch_Case {

    /**
     * The main method is the entry point of the program.
     *
     * Program flow:
     * 1. Read the student's mark.
     * 2. Read the student's attendance percentage.
     * 3. Display a menu of evaluation options.
     * 4. Use switch-case to execute the selected evaluation.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Create a Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);

        // ===================== Input Section =====================
        // Read the student's mark
        System.out.println("Enter your mark:");
        int mark = input.nextInt();

        // Read the student's attendance percentage
        System.out.println("Enter the attendance percentage: (0-100)");
        int attendance = input.nextInt();

        // ===================== Menu Section =====================
        // Display available evaluation options to the user
        System.out.println("1. Print Pass or Fail Grade");
        System.out.println("2. Print Grade (Excellent, Very Good, etc.)");
        System.out.println("3. Check Scholarship Eligibility (Partial / Full)");

        // Read the user's menu choice
        System.out.println("Enter your choice (1, 2, or 3):");
        int choice = input.nextInt();

        // ===================== Switch-Case Section =====================
        // The switch statement selects which block of code to execute
        // based on the value of the variable 'choice'.
        switch (choice) {

            case 1:
                // Case 1: Pass or Fail evaluation
                System.out.println("You are in Pass or Fail Evaluation!");

                // If the mark is 60 or higher, the student passes
                if (mark >= 60) {
                    System.out.println("Grade: Pass");
                } else {
                    System.out.println("Grade: Fail");
                }
                break;

            case 2:
                // Case 2: Detailed grade evaluation
                System.out.println("You are in Excellent, Very Good, Good... Evaluation!");

                // Determine the grade category based on the mark
                if (mark >= 90) {
                    System.out.println("Grade: excellent");
                } else if (mark >= 80) {
                    System.out.println("Grade: very good");
                } else if (mark >= 70) {
                    System.out.println("Grade: good");
                } else if (mark >= 60) {
                    System.out.println("Grade: accepted");
                } else {
                    System.out.println("Grade: Fail");
                }
                break;

            case 3:
                // Case 3: Scholarship eligibility evaluation
                System.out.println("You are in Scholarship Evaluation (Partial / Full)");

                // Scholarship rules:
                // - Mark must be at least 85
                // - Attendance >= 90 gives full scholarship
                // - Attendance < 90 gives partial scholarship
                if (mark >= 85 && attendance >= 90) {
                    System.out.println("Full Scholarship");
                } else if (mark >= 85 && !(attendance >= 90)) {
                    System.out.println("Partial Scholarship");
                } else {
                    System.out.println("Not eligible for a scholarship!");
                }
                break;

            default:
                // Executed when the user enters a value other than 1, 2, or 3
                System.out.println("Wrong Input");
        }

        // Close the Scanner to release system resources
        input.close();
    }

}
