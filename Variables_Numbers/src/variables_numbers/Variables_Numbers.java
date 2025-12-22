package variables_numbers;

/**
 * This class demonstrates how to declare and use numeric variables in Java.
 *
 * Topics covered: - Variable declaration - Numeric data types in Java -
 * Printing values to the console
 */
public class Variables_Numbers {

    /**
     * The main method is the entry point of the program. The code inside this
     * method will be executed when the program runs.
     */
    public static void main(String[] args) {

        // General variable declaration format:
        // dataType variableName = value;
        // Java variables can store:
        // - Numerical data (numbers)
        // - Text data (we will see this later with String)
        // --------------------------------------------------
        // BYTE
        // --------------------------------------------------
        // byte uses 8 bits of memory
        // Range: -128 to 127
        // Used for very small numbers
        byte smallNumber = 100;
        System.out.println("Byte Value: " + smallNumber);

        // --------------------------------------------------
        // SHORT
        // --------------------------------------------------
        // short uses 16 bits of memory
        // Range: -32,768 to 32,767
        // Used for small integer values
        short year = 2025;
        System.out.println("Short Value: " + year);

        // --------------------------------------------------
        // INT (MOST IMPORTANT INTEGER TYPE)
        // --------------------------------------------------
        // int uses 32 bits of memory
        // This is the default integer type in Java
        int age = 20;
        int example = 10000;
        System.out.println("Int Value: " + example);

        // --------------------------------------------------
        // LONG
        // --------------------------------------------------
        // long uses 64 bits of memory
        // Used for very large integer values
        // Must end with the letter 'L'
        long distanceFromTheMoon = 384400000000L;
        System.out.println("Long Value: " + distanceFromTheMoon);

        // --------------------------------------------------
        // FLOATING-POINT NUMBERS (DECIMALS)
        // --------------------------------------------------
        // FLOAT
        // float uses 32 bits of memory
        // Used for decimal numbers
        // Must end with 'f'
        float temp = 37.5f;
        System.out.println("Float Value: " + temp);

        // DOUBLE (MOST IMPORTANT FOR DECIMALS)
        // double uses 64 bits of memory
        // This is the default decimal type in Java
        double gpa = 3.4;
        System.out.println("Double Value: " + gpa);
    }
}
