package control_flow_conditional_if_else_statements;

import java.util.Scanner;

/**
 * This class demonstrates the use of conditional control flow in Java.
 *
 * The program covers:
 * - Simple if-else statements
 * - Multi-branch if-else-if statements
 * - Using logical operators (AND, OR, NOT)
 *
 * The program takes a student's mark and attendance percentage
 * and uses conditions to determine:
 * - Pass or Fail
 * - Grade category
 * - Scholarship eligibility
 */
public class Control_Flow_Conditional_IF_Else_Statements {

    /**
     * The main method is the starting point of the program.
     *
     * Program flow:
     * 1. Read the student's mark.
     * 2. Decide Pass or Fail using a simple if-else.
     * 3. Determine the grade using a multi-branch if-else.
     * 4. Read attendance percentage.
     * 5. Decide scholarship eligibility using compound conditions.
     *
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {

        // Create a Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);

        // ===================== Simple if-else =====================
        // This section checks whether the student passes or fails.
        System.out.println("Enter your mark:");
        int mark = input.nextInt();

        // If the mark is 60 or higher, the student passes.
        // Otherwise, the student fails.
        if (mark >= 60) {
            System.out.println("Grade: Pass");
        } else {
            System.out.println("Grade: Fail");
        }

        // ===================== Multi-branch if-else =====================
        // This section assigns a grade category based on the mark.
        // The conditions are checked from top to bottom.
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

        // ===================== Scholarship decision =====================
        // Scholarship rules:
        // - Mark must be 85 or higher
        // - Attendance determines full or partial scholarship
        System.out.println("Enter the attendance percentage: (0-100)");
        int attendance = input.nextInt();

        // Logical operators used:
        // &&  means AND
        // ||  means OR
        // !   means NOT
        //
        // Full Scholarship:
        // mark >= 85 AND attendance >= 90
        if (mark >= 85 && attendance >= 90) {
            System.out.println("Full Scholarship");

        // Partial Scholarship:
        // mark >= 85 AND attendance is less than 90
        } else if (mark >= 85 && !(attendance >= 90)) {
            System.out.println("Partial Scholarship");

        // Any other case:
        // mark < 85
        } else {
            System.out.println("Not eligible for a scholarship!");
        }

        // Close the Scanner to free system resources
        input.close();
    }

}
