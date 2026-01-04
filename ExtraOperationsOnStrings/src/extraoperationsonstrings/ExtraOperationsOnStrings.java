package extraoperationsonstrings;

/**
 * ExtraOperationsOnStrings
 * -----------------------
 * This class demonstrates common and important operations that can be
 * performed on String objects in Java.
 *
 * Topics covered:
 * - Trimming whitespace
 * - Extracting substrings
 * - Replacing text
 * - Checking contents of a string
 * - Checking string prefixes and suffixes
 *
 * This example is intended for beginners learning how to manipulate strings.
 */
public class ExtraOperationsOnStrings {

    /**
     * The main method is the entry point of the program.
     * It executes several examples of String operations
     * and prints the results to the console.
     *
     * @param args command-line arguments (not used in this example)
     */
    public static void main(String[] args) {

        /* ---------------------------------------------------------
         * 1. trim()
         * ---------------------------------------------------------
         * The trim() method removes leading and trailing spaces
         * from a string.
         */

        String greeting = "          Hello Java             ";
        System.out.println("Before trim: " + greeting);

        // Remove extra spaces from the beginning and end
        greeting = greeting.trim();
        System.out.println("After trim: " + greeting);

        /* ---------------------------------------------------------
         * Example: Trimming user input such as an email
         * ---------------------------------------------------------
         */

        String email = "       ali2020@gmail.com ";
        email = email.trim();
        System.out.println("Trimmed email: " + email);

        /* ---------------------------------------------------------
         * 2. substring(startIndex, endIndex)
         * ---------------------------------------------------------
         * Extracts part of a string starting from startIndex
         * up to (but not including) endIndex.
         */

        String username = email.substring(0, 4);
        System.out.println("Username extracted from email: " + username);

        /* ---------------------------------------------------------
         * 3. replace(oldText, newText)
         * ---------------------------------------------------------
         * Replaces all occurrences of oldText with newText.
         */

        String message = "Hello Java is Hard!!";
        System.out.println("Original message: " + message);

        message = message.replace("Hard", "Fun");
        System.out.println("Modified message: " + message);

        /* ---------------------------------------------------------
         * 4. contains(String)
         * ---------------------------------------------------------
         * Checks whether a string contains a specific sequence
         * of characters. Returns true or false.
         */

        String ahmedEmail = "ahmed@gmail.com";
        System.out.println(
            "Did Ahmed enter a valid email? " + ahmedEmail.contains("@")
        );

        String moeEmail = "moe2023gmail.com";
        System.out.println(
            "Did Moe enter a valid email? " + moeEmail.contains("@")
        );

        /* ---------------------------------------------------------
         * 5. startsWith(String)
         * ---------------------------------------------------------
         * Checks if a string begins with a specific prefix.
         */

        String fileName = "Lecture1.pdf";
        System.out.println(
            "Is this a lecture file? " + fileName.startsWith("Lecture")
        );

        /* ---------------------------------------------------------
         * 6. endsWith(String)
         * ---------------------------------------------------------
         * Checks if a string ends with a specific suffix.
         */

        System.out.println(
            "Is this a PDF file? " + fileName.endsWith(".pdf")
        );
    }
}
