//*This program validates a credit card number */

import java.util.Scanner;

public class CreditCardValidator {

    /** Return true if the card number is valid */
    public static boolean isValid(long number) {
        return (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;
    }

    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String numStr = Long.toString(number);
        for (int i = numStr.length() - 2; i >= 0; i -= 2) {
            sum += getDigit(Character.getNumericValue(numStr.charAt(i)) * 2);
        }
        return sum;
    }

    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits */
    public static int getDigit(int number) {
        if (number < 10) {
            return number;
        } else {
            return number / 10 + number % 10;
        }
    }

    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String numStr = Long.toString(number);
        for (int i = numStr.length() - 1; i >= 0; i -= 2) {
            sum += Character.getNumericValue(numStr.charAt(i));
        }
        return sum;
    }

    /** Return true if the number d is a prefix for number */
    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    /** Return the number of digits in d */
    public static int getSize(long d) {
        return Long.toString(d).length();
    }

    /** Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k) {
        String numStr = Long.toString(number);
        if (numStr.length() <= k) {
            return number;
        } else {
            return Long.parseLong(numStr.substring(0, k));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a credit card number
        System.out.print("Enter a credit card number: ");
        long cardNumber = scanner.nextLong();
        
        // Validate the card number
        if (isValid(cardNumber)) {
            System.out.println("The credit card number is valid.");
        } else {
            System.out.println("The credit card number is invalid.");
        }

        // Close the scanner
        scanner.close();
    }
}
