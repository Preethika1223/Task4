package Exception;
import java.util.Scanner;

public class WeekdayFinder {
    public static void main(String[] args) {
        // Array to store the names of the weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Create a Scanner object for taking input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the day position
        System.out.print("Enter the day position (0-6): ");
        int dayIndex = scanner.nextInt();

        // Try to access the array with the user-provided index and handle possible exceptions
        try {
            // Print the corresponding day name
            System.out.println("The day is: " + weekdays[dayIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Print an error message if the index is out of bounds
            System.err.println("Invalid day index. Please enter a number between 0 and 6.");
        }

        // Close the scanner
        scanner.close();
    }
}
/*output1
 * Enter the day position (0-6): 7
Invalid day index. Please enter a number between 0 and 6.
*/
/*output2
 * 
 */

