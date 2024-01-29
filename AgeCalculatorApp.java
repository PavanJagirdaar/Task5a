package task5a;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculatorApp {
    public static void main(String[] args) {
        // Create a Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their date of birth
        System.out.print("Enter your date of birth (yyyy-mm-dd): ");
        String userInput = scanner.nextLine();

        // Parse the user input into a LocalDate object
        LocalDate dateOfBirth = LocalDate.parse(userInput);

        // Calculate the age using Period.between
        Period age = Period.between(dateOfBirth, LocalDate.now());

        // Display the calculated age
        System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");

        // Close the scanner
        scanner.close();
    }
}
