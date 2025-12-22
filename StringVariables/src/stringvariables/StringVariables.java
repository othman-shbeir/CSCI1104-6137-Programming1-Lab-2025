package stringvariables;

/**
 * This class demonstrates how to use String variables in Java.
 *
 * Topics covered: - Creating String variables - Printing Strings - String
 * concatenation - Common String methods - Comparing Strings
 */
public class StringVariables {

    /**
     * The main method is the starting point of the program. All String examples
     * are executed from here.
     */
    public static void main(String[] args) {

        // Strings are used to store:
        // letters, words, and sentences
        // A single character uses char (single quotes)
        // char a = 'A';
        // Creating a String variable (double quotes)
        String name = "Mohammed";
        System.out.println(name);

        // --------------------------------------------------
        // STRING CONCATENATION
        // --------------------------------------------------
        // Concatenation means joining Strings together using '+'
        String firstName = "Mohammed";
        String lastName = "Ali";

        String fullName = firstName + " " + lastName;
        System.out.println("The full name is: " + fullName);

        // --------------------------------------------------
        // STRING LENGTH
        // --------------------------------------------------
        // length() returns the number of characters in a String
        System.out.println("The first name length is: " + firstName.length());

        // --------------------------------------------------
        // GET CHARACTER FROM STRING
        // --------------------------------------------------
        // charAt(index) returns the character at a specific index
        // Index starts from 0
        System.out.println("The third letter is: " + firstName.charAt(2));

        // --------------------------------------------------
        // CONVERT STRING TO UPPERCASE
        // --------------------------------------------------
        System.out.println(firstName.toUpperCase());

        // --------------------------------------------------
        // CONVERT STRING TO LOWERCASE
        // --------------------------------------------------
        System.out.println(firstName.toLowerCase());

        // --------------------------------------------------
        // STRING COMPARISON
        // --------------------------------------------------
        // Comparing Strings using equals() and equalsIgnoreCase()
        String a = "java";
        String b = "Java";

        // equals() checks if the content is exactly the same
        System.out.println(a.equals(b)); // false

        // equalsIgnoreCase() ignores uppercase and lowercase
        System.out.println(a.equalsIgnoreCase(b)); // true
    }
}
